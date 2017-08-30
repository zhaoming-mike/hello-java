package io.mike.design.pattern.gof.behavioral.mediator;

import io.mike.design.pattern.gof.SplitMessage;
/**
 * @author zhaoming
 *
 * 2017年8月30日 下午1:44:31
 */
public class HelloMessageHead implements SplitMessage.MessageHead {

	@Override
	public String head() {
		return "hello";
	}

}
