package io.mike.design.pattern.gof.structural.decorator;

import org.junit.Test;

import io.mike.design.pattern.gof.Message;
import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;

public class MessageDecoratorTester {

	@Test
	public void test() {
		MessageDecorator messageDecorator = new MessageDecorator(new Message() {
			@Override public String encode() {
				return "hello-mike";
			}
		});
		
		assertThat(messageDecorator.encode(), is("hello-mike"));
		assertThat(messageDecorator.encodeDecorator(), is("hello-Decorator!"));
		
		MessageDecorator messageDecorator2 = new MessageDecorator(messageDecorator);
		assertThat(messageDecorator2.encode(), is("hello-mike"));
		
	}
	
	
}
