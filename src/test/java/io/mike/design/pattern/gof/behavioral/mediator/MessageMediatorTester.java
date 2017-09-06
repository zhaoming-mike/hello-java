package io.mike.design.pattern.gof.behavioral.mediator;

import org.junit.Test;

import io.mike.design.pattern.gof.behavioral.mediator.HelloMessageHead;
import io.mike.design.pattern.gof.behavioral.mediator.MessageMediator;
import io.mike.design.pattern.gof.behavioral.mediator.MikeMessageBody;

import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;

/**
 * @author zhaoming
 *
 * 2017年8月30日 下午1:50:08
 */
public class MessageMediatorTester {

	@Test
	public void test() {
		
		/**
		 *	1、调停者又叫中介者模式、很像 proxy 模式(但比代理做的事情更多，可理解成高级代理模式)
		 *	2、通过 Mediator 和外部接口打交道 (接口与接口之间不需要彼此知道对方的存在)。
		 */
		MessageMediator messageMediator = new MessageMediator(new HelloMessageHead(), new MikeMessageBody());
		assertThat(messageMediator.encode(), is("hello:body:mike"));
	}
	
	
}
