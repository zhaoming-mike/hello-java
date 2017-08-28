package io.mike.design.pattern.gof.creational.abstract_factory;

import java.util.Map;

import com.google.common.collect.Maps;

/**
 * @author zhaoming
 *
 * 2017年8月28日 下午3:25:54
 */
public class AbstractMessageFactory {

	public enum Type { HELLO, MIKE; }
	
	private static Map<Type, Class<? extends SplitMessageFactory>> map = Maps.newHashMap();
	
	static {
		map.put(Type.HELLO, HelloSplitMessageFactory.class);
		map.put(Type.MIKE, MikeSplitMessageFactory.class);
	}
	
	public static SplitMessageFactory select(Type type) throws InstantiationException, IllegalAccessException {
		return map.get(type).newInstance();
	}
	
	
}
