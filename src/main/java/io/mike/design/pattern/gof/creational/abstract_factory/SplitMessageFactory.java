package io.mike.design.pattern.gof.creational.abstract_factory;

import io.mike.design.pattern.gof.SplitMessage;

/**
 * @author zhaoming
 *
 * 2017年8月28日 下午3:24:38
 */
public interface SplitMessageFactory {

	public SplitMessage.MessageHead createHead();
	public SplitMessage.MessageBody createBody();
}
