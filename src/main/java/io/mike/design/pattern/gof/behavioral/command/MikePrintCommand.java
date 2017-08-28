package io.mike.design.pattern.gof.behavioral.command;

import java.io.PrintStream;

/**
 * @author zhaoming
 *
 * 2017年8月28日 下午2:01:51
 */
public class MikePrintCommand implements Command {

	private PrintStream printer = System.out;
	
	public MikePrintCommand(PrintStream printer) {
		this.printer = printer;
	}
	
	@Override
	public void execute() {
		printer.println("Hello");
		printer.println("Mike");
	}

}
