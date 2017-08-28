package io.mike.design.pattern.gof.structural.composite;

import java.util.Arrays;
import java.util.List;

import org.apache.commons.lang3.StringUtils;

import com.google.common.collect.Lists;

import io.mike.design.pattern.gof.Message;

/**
 * @author zhaoming
 *
 * 2017年8月28日 下午5:04:48
 */
public class CompositeMessage implements Message {

	private List<Message> messages = Lists.newArrayList();
	
	public CompositeMessage(Message... message) {
		this.messages = Arrays.asList(message);
	}
	
	@Override
	public String encode() {
		List<String> messagesOut = Lists.newArrayList();
		for(Message each : messages) {
			messagesOut.add(each.encode());
		}
		return StringUtils.join(messagesOut, " + ");
	}
	

}
