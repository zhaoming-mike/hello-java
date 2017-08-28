package io.mike.design.pattern.gof.creational.abstract_factory;

import io.mike.design.pattern.gof.SplitMessage;
import io.mike.design.pattern.gof.SplitMessage.MessageBody;
import io.mike.design.pattern.gof.SplitMessage.MessageHead;

/**
 * @author zhaoming
 *
 * 2017年8月28日 下午3:30:20
 */
public class HelloSplitMessageFactory implements SplitMessageFactory {

	@Override
	public MessageHead createHead() {
		return new SplitMessage.DefaultMessageHead();
	}

	@Override
	public MessageBody createBody() {
		return new BodyMessage();
	}

	class BodyMessage implements SplitMessage.MessageBody {

		@Override
		public String body() {
			return "body:hello";
		}

		
	}
}
