package io.mike.design.pattern.gof.creational.factory_method;

import io.mike.design.pattern.gof.Message;

public class MikeMessageFactory {

	public Message createMessage() {
		return new Message() {
			@Override public String encode() {
				return "Mike";
			}
		};
	}

	
}
