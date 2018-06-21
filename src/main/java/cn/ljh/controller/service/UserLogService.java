package cn.ljh.controller.service;

import org.aopalliance.intercept.MethodInvocation;

public interface UserLogService {
	public Object saveUserLog(final MethodInvocation mi) throws Throwable;
}
