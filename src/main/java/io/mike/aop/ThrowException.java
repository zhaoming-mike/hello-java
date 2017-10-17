package io.mike.aop;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.aop.ThrowsAdvice;

public class ThrowException implements ThrowsAdvice {
	
	private static final Logger log = LoggerFactory.getLogger(ThrowException.class);
	
	public void afterThrowing(IllegalArgumentException e) throws Throwable {
		log.debug(this.getClass().getSimpleName() + " Throw exception!");
	}
	
	
}