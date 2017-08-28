package io.mike.design.pattern.gof.behavioral.interpreter;

import java.io.PrintStream;

/**
 * @author zhaoming
 *
 * 2017年8月28日 下午2:26:00
 */
public class PlusFunc implements MathFunc {

	private PrintStream printer = System.out;
	
	public PlusFunc(PrintStream printer) {
		this.printer = printer;
	}
	
	@Override
	public void exec(String args) {
		printer.println(args);
	}

}
