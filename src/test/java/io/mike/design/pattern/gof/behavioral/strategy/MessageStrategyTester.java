package io.mike.design.pattern.gof.behavioral.strategy;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;


/**
 * @author zhaoming
 *
 * 2017年9月8日 下午6:05:14
 */
public class MessageStrategyTester {

	@Test
	public void test() throws Exception {
	
		MessageStrategyContext context = new MessageStrategyContext(new HelloMessageStrategy());
		assertThat(context.encode(), is("Hello!"));
		
		context = new MessageStrategyContext(new MikeMessageStrategy());
		assertThat(context.encode(), is("Mike!"));
	}
	
	
}
