package io.mike.design.pattern.gof.creational.singleton;

import io.mike.design.pattern.gof.Message;

public class MessageSingleton implements Message {

	@Override
	public String encode() {
		return "singleton";
	}

	private MessageSingleton() {
		//Don't allow new it outside.
	}
	
	public static MessageSingleton instance() {
		return MessageSingletonHolder.instance;
	}
	
	public static class MessageSingletonHolder {
		private static final MessageSingleton instance = new MessageSingleton();
	}
	
	
}
