package io.mike.design.pattern.gof.structural.flyweight;

import io.mike.design.pattern.gof.Message;

public class MessageFlyWeight implements Message {

	private String value;
	
	public MessageFlyWeight(String value) {
		this.value = value;
	}
	
	@Override
	public String encode() {
		return value;
	}

}
