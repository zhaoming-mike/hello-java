package io.mike.design.pattern.gof.behavioral.state;


public class MessageAState implements MessageState {

	@Override
	public void append(MessageStateContext messageContext, String msg) {
		messageContext.append(msg).append(" ").setState(new MessageBState());
	}

}
