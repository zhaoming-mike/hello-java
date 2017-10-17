package io.mike.aop;

import java.lang.reflect.Method;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.aop.MethodBeforeAdvice;

public class BeforeMethod implements MethodBeforeAdvice {
	
	private static final Logger log = LoggerFactory.getLogger(BeforeMethod.class);
	
	@Override
	public void before(Method method, Object[] args, Object target) throws Throwable {
		System.out.println("++++++++++++++++" + args.length);
		log.debug("method:" + method);
		log.debug("args:" + printArgs(args));
		log.debug("target:" + target);
	}

	/**
	 * @param args
	 * @return
	 */
	private String printArgs(Object[] args) {
		int size = args.length;
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < size; i++) {
			sb.append(args[i]);
			sb.append(",");
		}
		return size == 0 ? "[]" : "[" + sb.substring(0, sb.length() - 1) + "]";
	}
	
	
}