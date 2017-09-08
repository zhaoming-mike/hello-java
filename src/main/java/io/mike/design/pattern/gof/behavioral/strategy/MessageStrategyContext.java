package io.mike.design.pattern.gof.behavioral.strategy;

import io.mike.design.pattern.gof.Message;

/**
 * @author zhaoming
 *
 * 2017年9月8日 下午5:06:35
 */
public class MessageStrategyContext implements Message {

	private MessageStrategy messageStrategy;

	public MessageStrategyContext(MessageStrategy messageStrategy) {
		this.messageStrategy = messageStrategy;
	}
	
	@Override
	public String encode() {
		return messageStrategy.encode();
	}
	
	
}
