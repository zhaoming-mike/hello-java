package io.mike.design.pattern.gof.behavioral.state;

public interface MessageState {

	public void append(MessageStateContext messageContext, String msg);
}
