package io.mike.design.pattern.gof.structural.flyweight;

import org.junit.Assert;
import org.junit.Test;

import io.mike.design.pattern.gof.Message;
import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;
public class MessageFlyWeightTester {

	@Test
	public void test() throws Exception {
		//享元模式：相同的对象不重复创建。
		Message message = MessageFlyWeightFactory.instance().createFactory("mike");
		Message copy = message;
		assertThat(message.encode(), is("mike"));
		message = MessageFlyWeightFactory.instance().createFactory("mike");
		Message copy2 = message;
		assertThat(message.encode(), is("mike"));
		Assert.assertSame(copy, copy2);
		
		Message a1 = new Message() { public String encode() {return "";}};
		Message a2 = new Message() { public String encode() {return "";}};
		Assert.assertNotSame(a1, a2);
	}
	
	
}
