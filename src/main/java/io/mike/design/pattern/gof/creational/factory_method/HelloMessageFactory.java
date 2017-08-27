package io.mike.design.pattern.gof.creational.factory_method;

import io.mike.design.pattern.gof.Message;

public class HelloMessageFactory extends MikeMessageFactory {

	@Override
	public Message createMessage() {
		return new Message() {
			@Override public String encode() {
				return "Hello";
			}
		};
	}

	
}
