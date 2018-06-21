package cn.ljh.controller.service.impl;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.aopalliance.intercept.MethodInvocation;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.taglibs.standard.functions.Functions;
import org.apache.taglibs.standard.lang.jstl.ELEvaluator;
import org.apache.taglibs.standard.lang.jstl.ELException;
import org.apache.taglibs.standard.lang.jstl.VariableResolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.task.TaskExecutor;
import org.springframework.stereotype.Service;

import cn.ljh.controller.mapper.UserlogMapper;
import cn.ljh.controller.po.Userlog;
import cn.ljh.controller.service.LogContext;
import cn.ljh.controller.service.UserLogService;
import cn.ljh.controller.validation.constraints.WriteLog;
import cn.ljh.controller.validation.constraints.WriteLog.WriteType;

@Service("userLogService")
public class UserLogServiceImpl implements UserLogService {
	private static Log log = LogFactory.getLog("error");
	private static Log userLog = LogFactory.getLog("user");
	static Map<String, Method> fns = new HashMap<String, Method>();
	static {
		try {
			// 此处添加jstl中的默认方法
			Method[] methods = Functions.class.getMethods();
			for (Method m : methods) {
				if ((m.getModifiers() & Modifier.STATIC) == Modifier.STATIC) {
					fns.put("fn:" + m.getName(), m);
				}
			}
			// 还有一些自己定义的方法，也加入进去
			// methods = WriteLogFunctions.class.getMethods();
			// for (Method m : methods) {
			// if ((m.getModifiers() & Modifier.STATIC) == Modifier.STATIC) {
			// fns.put("fn:" + m.getName(), m);
			// }
			// }
		} catch (SecurityException e) {
			e.printStackTrace();
		}
	}

	@Autowired
	private TaskExecutor taskExecutor;

	@Autowired
	private UserlogMapper userlogMapper;

	@Override
	public Object saveUserLog(final MethodInvocation mi) throws Throwable {
		// 取到WriteLog对象以便进一步取到定义的日志模板字符串
		final WriteLog annotation = mi.getMethod().getAnnotation(WriteLog.class);
		// 如果是after，函数执行完后再异步记录日志
		if (annotation.type() == WriteType.after) {
			final Object result = mi.proceed();
			taskExecutor.execute(new Runnable() {
				@Override
				public void run() {
					realWriteLog(mi, annotation, result);
				}
			});
			return result;
		} else {// 否则需要先记录日志，再执行函数
			realWriteLog(mi, annotation, null);
			return mi.proceed();
		}
	}

	/**
	 * 实际执行日志的写入
	 * 
	 * @param mi
	 *            当前调用的函数
	 * @param annotation
	 *            WriteLog对象
	 * @param result
	 *            函数返回值
	 */
	private void realWriteLog(final MethodInvocation mi, final WriteLog annotation, final Object result) {
		try {
			if (annotation != null) {
				// 声明一个VariableResolver 用于初始化 Evaluator
				MapVariableResolver vr = new MapVariableResolver(mi, result);
				// ELEvaluator 用来 evaluate
				ELEvaluator eval = new ELEvaluator(vr);
				// 允许包含函数
				System.setProperty("javax.servlet.jsp.functions.allowed", "true");
				String msg = annotation.value();
				if (msg != null) {
					// 为了便书写，WriteLog中的单引号就表示双引号（不然还需要转义）
					msg = msg.replaceAll("'", "\"");
					// 执行evaluate，String.class表示eval返回的类型，fns是函数映射map，fn是函数前缀
					Object obj = eval.evaluate(msg, null, String.class, fns, "fn");
					// 记录日志
					userLog.info(obj);
					// 插入到数据库
					Userlog record = new Userlog();
					record.setUserlogLog((String) obj);
					userlogMapper.insert(record);
				}
				vr.map.clear();
			}
		} catch (Exception ex) {
			log.warn("记录用户日志失败", ex);
		}
	}

	private class MapVariableResolver implements VariableResolver {
		private Map<String, Object> map;

		public MapVariableResolver(MethodInvocation mi, Object result) {
			Object[] args = mi.getArguments();
			map = new LinkedHashMap<String, Object>(args.length + 2);
			for (int i = 0; i < args.length; i++) {
				map.put("p" + i, args[i]);
				if ((!map.containsKey("ctx")) && args[i] instanceof HttpServletRequest) {
					map.put("ctx", new LogContextImpl((HttpServletRequest) args[i]));
				}
			}
			map.put("ret", result);
		}

		@Override
		public Object resolveVariable(String arg0, Object arg1) throws ELException {
			if (map.containsKey(arg0)) {
				return map.get(arg0);
			}
			return "[no named(" + arg0 + ") value]";
		}
	}

	@SuppressWarnings("rawtypes")
	private class LogContextImpl implements LogContext {
		private Map session;
		private String ip;

		public LogContextImpl(HttpServletRequest req) {
			HttpSession session2 = req.getSession();
			if (session2 instanceof Map) {
				session = (Map) session2;
			} else {
				session = new HashMap();
				Enumeration names = session2.getAttributeNames();
				while (names.hasMoreElements()) {
					String next = (String) names.nextElement();
					session.put(next, session2.getAttribute(next));
				}
			}

			ip = req.getHeader("x-forwarded-for");
			if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
				ip = req.getHeader("Proxy-Client-IP");
			}
			if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
				ip = req.getHeader("WL-Proxy-Client-IP");
			}
			if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
				ip = req.getRemoteAddr();
			}
		}

		public String getIp() {
			return ip;
		}

		public Map getSession() {
			return session;
		}
	}

}
