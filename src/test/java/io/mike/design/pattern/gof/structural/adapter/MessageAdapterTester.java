package io.mike.design.pattern.gof.structural.adapter;

import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;

import org.junit.Test;

/**
 * @author zhaoming
 *
 * 2017年8月30日 上午9:31:25
 */
public class MessageAdapterTester {

	@Test
	public void test() {
		//适配器模式能够快速让一个类实现预定的所有接口，当需要改变处理行为时覆写上层接口即可。
		MikeMessage mikeMessage = new MikeMessage();
		assertThat(mikeMessage.encode(), is("MikeMessage:default"));
		
		MikeMessage mikeMessage2 = new MikeMessage() {
			@Override public String encode() {
				return "aaa";
			}};
		assertThat(mikeMessage2.encode(), is("aaa"));
	}
	
	
}
