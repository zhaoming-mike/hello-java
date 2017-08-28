package io.mike.design.pattern.gof.behavioral.interpreter;

import java.io.PrintStream;

import org.junit.Test;
import static org.mockito.Mockito.*;

/**
 * @author zhaoming
 *
 * 2017年8月28日 下午2:36:09
 */
public class MathInterpreterTester {

	@Test
	public void test_math_interpreter() {
	
		MathInterpreter mathInterpreter = new MathInterpreter();
		PrintStream mockPrinter = mock(PrintStream.class);
		PlusFunc plusFunc = new PlusFunc(mockPrinter);
		mathInterpreter.registerFunc("plus", plusFunc);
		mathInterpreter.interpret("plus('1+1')");
		verify(mockPrinter, times(1)).println("1+1");
		
	}
	
	
}
