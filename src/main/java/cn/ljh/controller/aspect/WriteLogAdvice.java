package cn.ljh.controller.aspect;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

import cn.ljh.controller.service.UserLogService;

public class WriteLogAdvice implements MethodInterceptor {

	private UserLogService userLogService;

	@Override
	public Object invoke(MethodInvocation arg0) throws Throwable {
		if (userLogService != null) {
			return userLogService.saveUserLog(arg0);
		}
		return arg0.proceed();
	}

	public UserLogService getUserLogService() {
		return userLogService;
	}

	public void setUserLogService(UserLogService userLogService) {
		this.userLogService = userLogService;
	}

}
