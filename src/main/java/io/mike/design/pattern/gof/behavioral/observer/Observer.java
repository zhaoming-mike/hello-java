package io.mike.design.pattern.gof.behavioral.observer;

import io.mike.design.pattern.gof.Message;

/**
 * 观察者
 * @author zhaoming
 *
 * 2017年8月29日 上午9:19:23
 */
public interface Observer {

	/**
	 * 
	 * @param message 关注的对象
	 */
	public void onUpdate(Message message);
}
