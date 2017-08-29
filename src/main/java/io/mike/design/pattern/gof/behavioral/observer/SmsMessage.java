package io.mike.design.pattern.gof.behavioral.observer;

import java.util.List;

import com.google.common.collect.Lists;

import io.mike.design.pattern.gof.Message;

/**
 * @author zhaoming
 *
 * 2017年8月29日 上午9:21:07
 */
public class SmsMessage implements Message {

	private String prefix = "default:";
	
	private List<Observer> observers = Lists.newArrayList();
	
	public void addObserver(Observer observer) {
		observers.add(observer);
	}
	
	public void notifyObservers() {
		for(Observer each : observers)
			each.onUpdate(this);
	}
	
	public String getPrefix() {
		return prefix;
	}

	public void setPrefix(String prefix) {
		this.prefix = prefix;
		notifyObservers();
	}

	@Override
	public String encode() {
		return prefix;
	}
	
	
}
