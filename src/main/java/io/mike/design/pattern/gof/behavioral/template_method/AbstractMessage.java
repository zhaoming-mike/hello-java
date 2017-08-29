package io.mike.design.pattern.gof.behavioral.template_method;

import io.mike.design.pattern.gof.Message;

/**
 * @author zhaoming
 *
 * 2017年8月29日 下午3:10:01
 */
public abstract class AbstractMessage implements Message {

	@Override
	public String encode() {
		StringBuilder sb = new StringBuilder();
		sb.append(makeHead());
		sb.append(makeBody());
		return sb.toString();
	}

	public abstract String makeHead();
	public abstract String makeBody();
	
}
