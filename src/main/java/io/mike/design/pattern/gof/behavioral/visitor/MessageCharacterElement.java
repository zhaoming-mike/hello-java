package io.mike.design.pattern.gof.behavioral.visitor;

public class MessageCharacterElement implements MessageElement {

	private char ch;
	
	public MessageCharacterElement(char ch) {
		this.ch = ch;
	}
	
	public char getCh() {
		return ch;
	}
	
	@Override
	public void accept(MessageVisitor messageVisitor) {
		messageVisitor.visitor(this);
	}

}
