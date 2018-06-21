package cn.ljh.controller.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(5)
public class MyLog {

	@Pointcut("execution(public * cn.ljh.controller.service..*.*(..))")
	public void myLogPointCut() {
	}

	@Before("myLogPointCut()")
	public void before(JoinPoint joinPoint) {
		System.out.println("[Mylog] before advise");
	}

	@Around("myLogPointCut()")
	public Object around(ProceedingJoinPoint pjp) throws Throwable {
		Object result = null;
		System.out.println("[Mylog] around advise 1");
		result = pjp.proceed();
		System.out.println("[Mylog] around advise2");
		return result;
	}

	@AfterReturning("myLogPointCut()")
	public void afterReturning(JoinPoint joinPoint) {
		System.out.println("[Mylog] afterReturning advise");
	}

	@AfterThrowing("myLogPointCut()")
	public void afterThrowing(JoinPoint joinPoint) {
		System.out.println("[Mylog] afterThrowing advise");
	}

	@After("myLogPointCut()")
	public void after(JoinPoint joinPoint) {
		System.out.println("[Mylog] after advise");
	}

}
