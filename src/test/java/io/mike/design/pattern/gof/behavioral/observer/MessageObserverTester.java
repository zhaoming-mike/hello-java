package io.mike.design.pattern.gof.behavioral.observer;

import org.junit.Test;
import static org.mockito.Mockito.*;

import java.io.PrintStream;
/**
 * @author zhaoming
 *
 * 2017年8月29日 上午9:32:06
 */
public class MessageObserverTester {

	@Test
	public void test_message_observer() {
		MessageObserver wang = new MessageObserver("小王");
		PrintStream mock = mock(PrintStream.class);
		wang.setPrinter(mock);
		
		SmsMessage smsMessage = new SmsMessage();
		smsMessage.addObserver(wang);
		smsMessage.setPrefix("10086");
		
		verify(mock, times(1)).println("小王 receive:10086");
		
	}
	
	
}
