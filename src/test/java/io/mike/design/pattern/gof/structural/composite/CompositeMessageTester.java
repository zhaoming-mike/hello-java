package io.mike.design.pattern.gof.structural.composite;

import org.junit.Test;

import io.mike.design.pattern.gof.Message;
import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;

/**
 * @author zhaoming
 *
 * 2017年8月28日 下午5:08:56
 */
public class CompositeMessageTester {

	@Test
	public void test() {
		CompositeMessage compositeMessage = new CompositeMessage(
			new Message() { @Override public String encode() { return "a"; } },
			new Message() { @Override public String encode() { return "b"; } }
		);
		assertThat(compositeMessage.encode(), is("a + b"));
	}
	
	
}
