package io.mike.design.pattern.gof.behavioral.chain_of_responsibility;

import org.hamcrest.Matchers;
import org.junit.Assert;
import org.junit.Test;

public class AbstractMessageHandlerTester {

	@Test
	public void test() {
		//责任链模式一般是链表保存 handler ，一个 handler 处理完调用下一个。这里做了一定的简化为了更好的说明。
		AbstractMessageHandler handler = new MikeMessageHandler().setHandler(new HelloMessageHandler());
		String encode = handler.encode();
		Assert.assertThat(encode, Matchers.is("MikeHello"));
	}
	
	
}
