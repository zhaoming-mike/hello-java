package io.mike.design.pattern.gof.creational.prototype;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import io.mike.design.pattern.gof.Message;
import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;
/**
 * @author zhaoming
 *
 * 2017年8月28日 下午4:31:59
 */
public class MessagePrototypeTester {

	private static final Logger log = LoggerFactory.getLogger(MessagePrototypeTester.class);
	
	@Test
	public void test_new() {
		assertThat(new MessagePrototype("a").encode(), is("a"));
	}
	
	
	@Test
	public void test_clone() {
		try {
			Message message = MessagePrototype.prototype.clone();
			assertThat(message.encode(), is("Mike"));
		} catch (CloneNotSupportedException e) {
			log.error(e.getMessage(), e);
		}
		
	}
	
	
}
