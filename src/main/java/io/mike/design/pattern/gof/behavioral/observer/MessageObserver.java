package io.mike.design.pattern.gof.behavioral.observer;

import java.io.PrintStream;

import io.mike.design.pattern.gof.Message;

/**
 * @author zhaoming
 *
 * 2017年8月29日 上午9:28:39
 */
public class MessageObserver implements Observer {

	private String name = this.getClass().getSimpleName();
	
	public MessageObserver(String name) {
		this.name = name;
	}
	
	public void setPrinter(PrintStream printer) {
        this.printer = printer;
    }
	
	private PrintStream printer = System.out;
	
	@Override
	public void onUpdate(Message message) {
		printer.println(name + " receive:" + message.encode());
	}

}
