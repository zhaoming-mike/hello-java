package io.mike.design.pattern.gof.creational.singleton;

import static org.junit.Assert.*;

import static org.hamcrest.Matchers.*;
import org.junit.Test;


public class MessageSingletonTester {

	@Test
	public void test() {
		MessageSingleton instance1 = MessageSingleton.instance();
		MessageSingleton instance2 = MessageSingleton.instance();
		
		assertEquals(instance1, instance2);
		
		assertThat(instance1.encode(), is(instance2.encode()));
		assertThat(instance1.encode(), is("singleton"));
		assertThat(instance2.encode(), is("singleton"));
		
	}
	
	
}
