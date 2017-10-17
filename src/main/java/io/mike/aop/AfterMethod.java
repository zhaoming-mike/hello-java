package io.mike.aop;

import java.lang.reflect.Method;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.aop.AfterReturningAdvice;

public class AfterMethod implements AfterReturningAdvice {
	
	private static final Logger log = LoggerFactory.getLogger(AfterMethod.class);
	
	@Override
	public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
		log.debug("After method!");
		log.debug("returnValue:" + returnValue);
		log.debug("method:" + method);
		log.debug("args:" + args);
		log.debug("target:" + target);
	}
	
	
}