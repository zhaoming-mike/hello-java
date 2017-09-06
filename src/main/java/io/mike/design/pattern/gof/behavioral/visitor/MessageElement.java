package io.mike.design.pattern.gof.behavioral.visitor;

public interface MessageElement {

	public void accept(MessageVisitor messageVisitor);
}
