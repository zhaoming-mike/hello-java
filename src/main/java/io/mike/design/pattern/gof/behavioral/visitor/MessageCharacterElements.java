package io.mike.design.pattern.gof.behavioral.visitor;

import java.util.List;

import com.google.common.collect.Lists;

public class MessageCharacterElements implements MessageElement {

	private List<MessageCharacterElement> list = Lists.newArrayList();
	
	public MessageCharacterElements(char... chars) {
		for(char each : chars) {
			list.add(new MessageCharacterElement(each));
		}
	}

	@Override
	public void accept(MessageVisitor messageVisitor) {
		for(MessageCharacterElement each : list) {
			messageVisitor.visitor(each);
		}
	}
}
