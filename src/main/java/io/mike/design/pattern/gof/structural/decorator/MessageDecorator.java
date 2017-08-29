package io.mike.design.pattern.gof.structural.decorator;

import org.apache.commons.lang3.StringUtils;

import io.mike.design.pattern.gof.Message;

public class MessageDecorator implements Message {

	private Message message;
	
	public MessageDecorator(Message message) {
		this.message = message;
	}
	
	public String encodeDecorator() {
		return StringUtils.substringBefore(message.encode(), "-") + "-Decorator!";
	}
	
	@Override
	public String encode() {
		return message.encode();
	}

}
