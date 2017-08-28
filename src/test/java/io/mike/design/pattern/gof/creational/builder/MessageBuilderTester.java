package io.mike.design.pattern.gof.creational.builder;

import org.junit.Test;

import io.mike.design.pattern.gof.Message;

import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;
/**
 * @author zhaoming
 *
 * 2017年8月28日 下午4:53:55
 */
public class MessageBuilderTester {

	@Test
	public void test_a() {
		Message message = MessageBuilder.newBuilder()
				.setHead("hhh")
				.setBody("AAA")
				.build();
		assertThat(message.encode(), is("hhh|AAA"));
	}
	
	@Test
	public void test_b() {
		Message message = MessageBuilder.newBuilder()
				.setHead("h")
				.setBody("BBB")
				.build();
		assertThat(message.encode(), is("h|BBB"));
	}
	
	
}
