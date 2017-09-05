package io.mike.design.pattern.gof.behavioral.state;

import org.junit.Test;
import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;

public class MessageStateContextTester {

	@Test
	public void test_state_machine() {
		//A > B > Hello > empty
		MessageStateContext messageStateContext = new MessageStateContext();
		messageStateContext.appendMsg("mike");
		assertThat(messageStateContext.encode(), is("mike "));

		messageStateContext.appendMsg("love git");
		assertThat(messageStateContext.encode(), is("mike love git!"));

		messageStateContext.appendMsg("clean and say hello");
		assertThat(messageStateContext.encode(), is("hello!"));

		messageStateContext.appendMsg("do nothing");
		assertThat(messageStateContext.encode(), is("hello!"));
	}
	
	
}
