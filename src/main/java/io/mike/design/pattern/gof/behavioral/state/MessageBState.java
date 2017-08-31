package io.mike.design.pattern.gof.behavioral.state;


public class MessageBState implements MessageState {

	@Override
	public void append(MessageStateContext messageContext, String msg) {
		messageContext.append(msg).append("!").setState(new MessageHelloState());
	}

}
