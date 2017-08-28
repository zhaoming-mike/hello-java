package io.mike.design.pattern.gof.behavioral.command;

import java.io.PrintStream;

import org.junit.Test;
import static org.mockito.Mockito.*;

/**
 * @author zhaoming
 *
 * 2017年8月28日 下午2:03:27
 */
public class MikePrintCommandTester {

	@Test
	public void test() {
		PrintStream mockPrinter = mock(PrintStream.class);
		MikePrintCommand mikePrintCommand = new MikePrintCommand(mockPrinter);
		mikePrintCommand.execute();
		verify(mockPrinter, times(1)).println("Mike");
		verify(mockPrinter, times(1)).println("Hello");
	}
	
	
}
