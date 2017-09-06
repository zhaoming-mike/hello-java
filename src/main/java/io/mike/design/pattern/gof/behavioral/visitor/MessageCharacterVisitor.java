package io.mike.design.pattern.gof.behavioral.visitor;

import io.mike.design.pattern.gof.Message;

public class MessageCharacterVisitor implements MessageVisitor, Message {

	private StringBuffer sb = new StringBuffer();
	
	@Override
	public String encode() {
		return sb.toString();
	}

	@Override
	public void visitor(MessageElement messageElement) {
		if(messageElement instanceof MessageCharacterElement) {
			MessageCharacterElement messageCharacterElement = (MessageCharacterElement) messageElement;
			sb.append(messageCharacterElement.getCh());
		}
	}

}
