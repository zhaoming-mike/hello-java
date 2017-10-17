package io.mike.aop;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author zhaoming
 *
 * 2017年10月17日 下午3:32:46
 */
public class UserService {

	private static final Logger log = LoggerFactory.getLogger(UserService.class);
	
	public void getUserInfo(long id) {
		log.debug(this.getClass().getSimpleName() + " running... " + "id:" + id);
	}
	public void getNick() {
		log.debug(this.getClass().getSimpleName() + "2 running... ");
	}
	/**
	 * @param l
	 * @param m
	 */
	public void getUserInfo(long l, long m) {
		log.debug(this.getClass().getSimpleName() + "2 running... l:{} m:{}", l, m);
	}
	
	
}
