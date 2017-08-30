package io.mike.design.pattern.gof.structural.adapter;

import io.mike.design.pattern.gof.Message;

/**
 * @author zhaoming
 *
 * 2017年8月30日 上午9:35:53
 */
public class MessageAdapter implements Message {

	@Override
	public String encode() {
		return getClass().getSimpleName() + ":default";
	}

}
