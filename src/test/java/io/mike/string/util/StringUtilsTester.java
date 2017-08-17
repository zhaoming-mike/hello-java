package io.mike.string.util;

import org.junit.Assert;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author zhaoming
 *
 * 2017年8月17日 下午5:05:51
 */
public class StringUtilsTester {

	private static final Logger log = LoggerFactory.getLogger(StringUtilsTester.class);
	
	
	@Test
	public void test_line() {
		log.debug(StringUtils.makeCharLine(100));
	}
	
	@Test
	public void test() {
		String ip = "127.0.0.1";
		long ipToLong = StringUtils.ipToLong(ip);
		String longToIp = StringUtils.longToIp(ipToLong);
		log.debug("ip:{} ipToLong:{}", new Object[]{ip, ipToLong});
		log.debug("longToIp:{} ip:{} ", new Object[]{longToIp, ip});
		Assert.assertEquals(ip, longToIp);
	}
	
	
}
