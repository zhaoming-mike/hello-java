package io.mike.design.pattern.gof.creational.factory_method;

import static org.hamcrest.Matchers.*;
import static org.junit.Assert.*;
import org.junit.Test;

import io.mike.design.pattern.gof.Message;

/**
 * <抽象工厂>和<工厂方法>的区别在于
 * 1、<抽象工厂>抽象的是工厂
 * 1、<工厂方法>抽象的是生产对象的过程
 * @author zhaoming
 */
public class MessageFactoryTester {

	@Test
	public void test_hello_factory() {
		
		HelloMessageFactory helloMessageFactory = new HelloMessageFactory();
		
		Message createMessage = helloMessageFactory.createMessage();
		
		assertThat(createMessage.encode(), is("Hello"));
	}
	
	@Test
	public void test_mike_factory() {
		
		MikeMessageFactory mikeMessageFactory = new MikeMessageFactory();
		
		Message createMessage = mikeMessageFactory.createMessage();
		
		assertThat(createMessage.encode(), is("Mike"));
	}
	
	
}
