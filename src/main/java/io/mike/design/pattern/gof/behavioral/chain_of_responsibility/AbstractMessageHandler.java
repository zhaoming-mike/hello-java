package io.mike.design.pattern.gof.behavioral.chain_of_responsibility;

public abstract class AbstractMessageHandler implements Message {

	private AbstractMessageHandler next;
	
	public AbstractMessageHandler setHandler(AbstractMessageHandler next) {
		this.next = next;
		return this;
	}
	
	public abstract void handle(StringBuilder sb);

	@Override
	public String encode() {
		StringBuilder sb = new StringBuilder();
		handle(sb);
		if(next != null)
			next.handle(sb);
		return sb.toString();
	}
	
	
	
}
