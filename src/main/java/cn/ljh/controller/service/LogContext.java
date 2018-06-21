package cn.ljh.controller.service;

import java.util.Map;

public interface LogContext {
	@SuppressWarnings("rawtypes")
	public Map getSession();

	public String getIp();
}
