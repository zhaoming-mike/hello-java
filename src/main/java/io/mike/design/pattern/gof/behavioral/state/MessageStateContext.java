package io.mike.design.pattern.gof.behavioral.state;

import io.mike.design.pattern.gof.Message;

public class MessageStateContext implements Message {

	private StringBuilder sb;
	
	private MessageState messageState;
	
	public MessageStateContext() {
		sb = new StringBuilder();
		messageState = new MessageAState();
	}
	
	MessageStateContext clean() {
		sb = new StringBuilder();
		return this;
	}
	MessageStateContext append(String msg) {
		sb.append(msg);
		return this;
	}
	
	public MessageStateContext appendMsg(String msg) {
		this.messageState.append(this, msg);
		return this;
	}
	
	public MessageStateContext setState(MessageState messageState) {
		this.messageState = messageState;
		return this;
	}
	
	@Override
	public String encode() {
		return sb.toString();
	}

}
