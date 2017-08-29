package io.mike.design.pattern.gof.structural.facade;

import io.mike.design.pattern.gof.Message;
import io.mike.design.pattern.gof.creational.builder.MessageBuilder;

public class MessageFacade {

	private MessageFacade() {
		//Don't new it outside.
	}
	
	public static MessageFacade instance() {
		return MessageFacadeInstanceHolder.instance;
	}
	
	private static class MessageFacadeInstanceHolder {
		private final static MessageFacade instance = new MessageFacade();
	}
	
	public Message facadeMessage() {
		return MessageBuilder.newBuilder().setHead("head").setBody("body").build();
	}
	
	
}
