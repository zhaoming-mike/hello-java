package io.mike.string.util;

import org.joda.time.DateTime;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;


/**
 * @author zhaoming
 *
 * 2017年9月1日 上午10:40:58
 */
public class DateUtils {


	private static final Logger log = LoggerFactory.getLogger(DateUtils.class);
	
	/**
	 * 今天是星期几
	 * 星期一:1、星期二:2、... 星期日:7
	 * @throws Exception
	 */
	@Test
	public void test_joda_the_day_of_week() throws Exception {
		DateTime dateTime = new DateTime();
		log.debug("new DateTime():" + dateTime);
		DateTime now = DateTime.now();
		log.debug("DateTime.now():" + now);
		assertThat(dateTime.toString("yyyyMMdd"), is(now.toString("yyyyMMdd")));
		
		for (int i = 0; i < 100; i++) {
			int eachDayOfWeek = now.plusDays(i).dayOfWeek().get();
			if(i % 10 == 0) log.debug("dayOfWeek:" + eachDayOfWeek);
			assertThat(eachDayOfWeek, allOf(greaterThanOrEqualTo(1), lessThanOrEqualTo(7)));
		}
	}
	
	
}
