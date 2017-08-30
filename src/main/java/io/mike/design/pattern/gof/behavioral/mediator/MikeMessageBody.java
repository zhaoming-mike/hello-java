package io.mike.design.pattern.gof.behavioral.mediator;

import io.mike.design.pattern.gof.SplitMessage;
/**
 * @author zhaoming
 *
 * 2017年8月30日 下午1:44:31
 */
public class MikeMessageBody implements SplitMessage.MessageBody {

	@Override
	public String body() {
		return "body:mike";
	}


}
