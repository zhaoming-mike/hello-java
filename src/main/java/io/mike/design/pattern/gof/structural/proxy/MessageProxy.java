package io.mike.design.pattern.gof.structural.proxy;

import io.mike.design.pattern.gof.Message;

public class MessageProxy implements Message {

	private Message message;
	
	public MessageProxy(Message message) {
		this.message = message;
	}
	
	@Override
	public String encode() {
		return message.encode();
	}
	
	public static class HelloMessageProxy implements Message {
		@Override public String encode() {
			return "hello";
		}
		
	}
	
	public static class DefaultMessageProxy implements Message {
		@Override public String encode() {
			return "default";
		}
		
	}

}
