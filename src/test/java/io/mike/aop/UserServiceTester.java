package io.mike.aop;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author zhaoming
 *
 * 2017年10月17日 下午3:32:03
 */
@RunWith( SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:app-ctx.xml")
public class UserServiceTester {

	@Autowired
	/** 使用代理过的对象 */
	@Qualifier("userServiceProxy")
	private UserService userService;
	
	@Test
	public void test() {
		Assert.assertNotNull(userService);
		userService.getNick();
	}
	
	@Test
	public void test2() {
		Assert.assertNotNull(userService);
		userService.getUserInfo(1111L);
	}
	
	@Test
	public void test3() {
		Assert.assertNotNull(userService);
		userService.getUserInfo(1111L, 222L);
	}
	
	
}
