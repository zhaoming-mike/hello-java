package io.mike.design.pattern.gof.behavioral.chain_of_responsibility;

public class HelloMessageHandler extends AbstractMessageHandler {

	@Override
	public void handle(StringBuilder sb) {
		if(sb == null)
			return;
		sb.append("Hello");
	}

}
