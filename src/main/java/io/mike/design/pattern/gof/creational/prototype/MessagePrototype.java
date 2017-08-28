package io.mike.design.pattern.gof.creational.prototype;

import io.mike.design.pattern.gof.Message;

/**
 * @author zhaoming
 *
 * 2017年8月28日 下午4:29:21
 */
public class MessagePrototype implements Message {

	private String context;
	
	public MessagePrototype(String context) {
		super();
		this.context = context;
	}

	@Override
	protected Message clone() throws CloneNotSupportedException {
		return new MessagePrototype(context);
	}

	@Override
	public String encode() {
		return context;
	}

	public static final MessagePrototype prototype = new MessagePrototype("Mike");
	
}
