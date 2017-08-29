package io.mike.design.pattern.gof.structural.facade;

import org.junit.Test;

import io.mike.design.pattern.gof.Message;
import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;

public class MessageFacadeTester {

	@Test
	public void test() {
		Message facadeMessage = MessageFacade.instance().facadeMessage();
		assertThat(facadeMessage.encode(), is("head|body"));
	}
	
	
}
