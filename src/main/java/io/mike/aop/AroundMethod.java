package io.mike.aop;

import java.util.Arrays;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AroundMethod implements MethodInterceptor {
	
	private static final Logger log = LoggerFactory.getLogger(AroundMethod.class);
	
	@Override
	public Object invoke(MethodInvocation methodInvocation) throws Throwable {

		log.debug("Method name : " + methodInvocation.getMethod().getName());
		log.debug("Method arguments : " + Arrays.toString(methodInvocation.getArguments()));

		// same with MethodBeforeAdvice
		log.debug("Before method!");

		try {
			// proceed to original method call
			Object result = methodInvocation.proceed();

			// same with AfterReturningAdvice
			log.debug("Before after!");

			return result;

		} catch (IllegalArgumentException e) {
			// same with ThrowsAdvice
			log.debug("Throw exception!");
			throw e;
		}
	}
}