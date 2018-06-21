package cn.ljh.controller.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

public class LoginInterceptor implements HandlerInterceptor {

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {

		// 如果是主页面则放行
		if (request.getRequestURI().equals(request.getContextPath() + "/")) {
			return true;
		}
		// 如果是页面登录，用户注册，用户check等则放行
		if (request.getRequestURI().indexOf("/user2/") >= 0) {
			return true;
		}
		HttpSession session = request.getSession();
		// 如果用户已登录也放行
		if (session.getAttribute("loginUserCustom") != null) {
			return true;
		}
		// 用户没有登录挑战到登录页面
		request.getRequestDispatcher("/WEB-INF/view/login.jsp").forward(request, response);

		return false;

	}

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("LoginInterceptor  post");
	}

	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		// TODO Auto-generated method stub
		System.out.println("LoginInterceptor  after");
	}

}
