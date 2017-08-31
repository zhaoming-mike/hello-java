package io.mike.design.pattern.gof.behavioral.state;


public class MessageEmptyState implements MessageState {

	@Override
	public void append(MessageStateContext messageContext, String msg) {
		//什么也不做。
	}

}
