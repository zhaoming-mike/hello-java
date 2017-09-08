package io.mike.design.pattern.gof.behavioral.strategy;

/**
 * @author zhaoming
 *
 * 2017年9月8日 下午6:01:34
 */
public class HelloMessageStrategy implements MessageStrategy {

	@Override
	public String encode() {
		return "Hello!";
	}

}
