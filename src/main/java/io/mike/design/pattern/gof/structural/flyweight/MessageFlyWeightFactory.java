package io.mike.design.pattern.gof.structural.flyweight;

import java.util.Map;

import com.google.common.collect.Maps;

import io.mike.design.pattern.gof.Message;

public class MessageFlyWeightFactory {

	private Map<String, Message> innerCache;
	
	public static MessageFlyWeightFactory instance() {
		return Holder.instance;
	}
	private MessageFlyWeightFactory() {
		innerCache = Maps.newHashMap();
	}
	
	public Message createFactory(String value) {
		Message message = innerCache.get(value);
		if(message == null) {
			message = new MessageFlyWeight(value);
			innerCache.put(value, message);
		}
		return message;
	}
	
	private static class Holder {
		private static final MessageFlyWeightFactory instance = new MessageFlyWeightFactory();
	}
	
	
}
