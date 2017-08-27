package io.mike.design.pattern.gof.structural.proxy;

import static org.hamcrest.Matchers.*;
import static org.junit.Assert.*;
import org.junit.Test;

public class MessageProxyTester {

	@Test
	public void test_default_proxy() {
		MessageProxy messageProxy = new MessageProxy(new MessageProxy.DefaultMessageProxy());
		assertThat(messageProxy.encode(), is("default"));
	}
	
	@Test
	public void test_hello_proxy() {
		MessageProxy messageProxy = new MessageProxy(new MessageProxy.HelloMessageProxy());
		assertThat(messageProxy.encode(), is("hello"));
	}
	
	
}
