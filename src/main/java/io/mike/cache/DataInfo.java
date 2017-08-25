package io.mike.cache;

import java.util.concurrent.Callable;

/**
 * @author zhaoming
 *
 * 2017年8月25日 下午6:23:46
 */
public class DataInfo<T> {

	private String name;
	private Callable<T> how2GetData;
	
	public DataInfo(String name, Callable<T> callable) {
		super();
		this.name = name;
		this.how2GetData = callable;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Callable<T> getCallable() {
		return how2GetData;
	}

	public void setCallable(Callable<T> callable) {
		this.how2GetData = callable;
	}
	
	
}
