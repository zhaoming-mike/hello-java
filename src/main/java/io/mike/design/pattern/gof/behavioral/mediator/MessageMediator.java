package io.mike.design.pattern.gof.behavioral.mediator;

import io.mike.design.pattern.gof.Message;
import io.mike.design.pattern.gof.SplitMessage.MessageBody;
import io.mike.design.pattern.gof.SplitMessage.MessageHead;

/**
 * @author zhaoming
 *
 * 2017年8月30日 下午1:42:08
 */
public class MessageMediator implements Message {

	private MessageHead head;
	private MessageBody body;
	
	public MessageMediator(MessageHead head, MessageBody body) {
		super();
		this.head = head;
		this.body = body;
	}
	
	@Override
	public String encode() {
		return head.head() + ":" + body.body();
	}
	
	
}
