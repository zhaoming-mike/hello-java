package io.mike.design.pattern.gof.behavioral.state;


public class MessageHelloState implements MessageState {

	@Override
	public void append(MessageStateContext messageContext, String msg) {
		messageContext.clean().append("hello").append("!").setState(new MessageEmptyState());
	}

}
