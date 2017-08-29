package io.mike.design.pattern.gof.behavioral.template_method;

import org.junit.Test;
import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;
/**
 * @author zhaoming
 *
 * 2017年8月29日 下午3:14:53
 */
public class MikeTemplateMessageTester {

	@Test
	public void test() {
		MikeTemplateMessage mikeTemplateMessage = new MikeTemplateMessage("<", "body...");
		assertThat(mikeTemplateMessage.encode(), is("<body..."));
		
	}
	
	
}
