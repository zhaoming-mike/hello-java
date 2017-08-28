package io.mike.design.pattern.gof.creational.abstract_factory;

import org.junit.Test;

import static io.mike.design.pattern.gof.creational.abstract_factory.AbstractMessageFactory.Type.*;

import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;
/**
 * @author zhaoming
 *
 * 2017年8月28日 下午3:37:10
 */
public class AbstractMessageFactoryTester {

	@Test
	public void test_hello_type_factory() throws InstantiationException, IllegalAccessException {
		SplitMessageFactory selectFactory = AbstractMessageFactory.select(HELLO);
		assertThat(selectFactory.createBody().body(), is("body:hello"));
		assertThat(selectFactory.createHead().head(), is("head:"));
	}
	
	@Test
	public void test_mike_type_factory() throws InstantiationException, IllegalAccessException {
		SplitMessageFactory selectFactory = AbstractMessageFactory.select(MIKE);
		assertThat(selectFactory.createBody().body(), is("body:mike"));
		assertThat(selectFactory.createHead().head(), is("head:"));
	}
	
	
}
