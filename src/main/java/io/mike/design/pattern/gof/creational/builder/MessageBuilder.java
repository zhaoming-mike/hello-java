package io.mike.design.pattern.gof.creational.builder;

import io.mike.design.pattern.gof.Message;
import io.mike.design.pattern.gof.SplitMessage;

/**
 * @author zhaoming
 *
 * 2017年8月28日 下午4:46:59
 */
public class MessageBuilder {
	
	String head;
	String body;
	
	public static MessageBuilder newBuilder() {
		return new MessageBuilder() ;
	}
	
	public MessageBuilder setHead(String head) {
		this.head = head; 
		return this;
	}
	
	public MessageBuilder setBody(String body) {
		this.body = body;
		return this;
	}
	
	
	public Message build() {
		return new SplitMessage(
				new SplitMessage.MessageHead(){
					@Override public String head() {
						return head;
					}
				},
				new SplitMessage.MessageBody() {
					@Override public String body() {
						return body;
					}
				}
		);
	}
	
	
}
