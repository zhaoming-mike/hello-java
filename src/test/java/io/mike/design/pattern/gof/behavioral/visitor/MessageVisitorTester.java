package io.mike.design.pattern.gof.behavioral.visitor;

import org.junit.Test;

import io.mike.design.pattern.gof.behavioral.visitor.MessageCharacterElements;
import io.mike.design.pattern.gof.behavioral.visitor.MessageCharacterVisitor;
import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;
public class MessageVisitorTester {

	@Test
	public void test() throws Exception {
		
		MessageCharacterElements messageCharacterElements = new MessageCharacterElements("Hello Mike!".toCharArray());
		MessageCharacterVisitor messageCharacterVisitor = new MessageCharacterVisitor();
		messageCharacterElements.accept(messageCharacterVisitor);
		
		assertThat(messageCharacterVisitor.encode(), is("Hello Mike!"));
		
	}
}
