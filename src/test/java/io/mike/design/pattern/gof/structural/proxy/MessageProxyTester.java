package io.mike.design.pattern.gof.structural.proxy;

import org.hamcrest.Matchers;
import org.junit.Assert;
import org.junit.Test;

public class MessageProxyTester {

	@Test
	public void test_default_proxy() {
		MessageProxy messageProxy = new MessageProxy(new MessageProxy.DefaultMessageProxy());
		Assert.assertThat(messageProxy.encode(), Matchers.is("default"));
	}
	
	@Test
	public void test_hello_proxy() {
		MessageProxy messageProxy = new MessageProxy(new MessageProxy.HelloMessageProxy());
		Assert.assertThat(messageProxy.encode(), Matchers.is("hello"));
	}
	
	
}
