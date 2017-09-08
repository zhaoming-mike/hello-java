package io.mike.http.server;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import io.mike.http.client.SimpleHttpClient;

/**
 * @author zhaoming
 *
 * 2017年8月16日 下午3:38:18
 */
public class SimpleHttpServerTester {

	private static final Logger log = LoggerFactory.getLogger(SimpleHttpServerTester.class);
	
	public static final int DEFAULT_PORT = 8888;
	public static final String DEFAULT_PATH = "/hello";
	
	@BeforeClass
	public static void beforeClass() throws InterruptedException {
		
		log.debug("start http server for test.");
		SimpleHttpServer.startServer(
				DEFAULT_PORT, 
				DEFAULT_PATH);
		//TimeUnit.SECONDS.sleep(3);
	}
	
	@AfterClass
	public static void afterClass() {
		log.debug("test finished stop http server.");
		SimpleHttpServer.stopServer();
	}
	
	@Before
	public void before() {
		log.debug("before each test...");
	}
	
	@After
	public void after() {
		log.debug("after each test...");
	}
	
	@Test
	public void test_httpclient() {
		SimpleHttpClient.visit();
	}
	
	@Test
	public void test2() {
		log.debug("test2");
	}

	
}