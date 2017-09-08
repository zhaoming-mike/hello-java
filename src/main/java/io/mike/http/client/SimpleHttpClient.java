/**
 * Copyright (c) 2017 YY Inc.
 * All Rights Reserved.
 * This program is the confidential and proprietary information of 
 * YY Inc. ("Confidential Information"). You shall not disclose such
 * Confidential Information and shall use it only in accordance with
 * the terms of the license agreement you entered into with YY Inc.
 */
package io.mike.http.client;

import java.io.IOException;

import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author zhaoming
 *
 * 2017年9月8日 下午6:14:25
 */
public class SimpleHttpClient {
	
	public static final int DEFAULT_PORT 		= 8888;
	public static final String DEFAULT_PATH 	= "/hello";
	
	private static final Logger log = LoggerFactory.getLogger(SimpleHttpClient.class);

	public static void visit() {
		log.debug("test http server response by httpclient.");
		CloseableHttpClient httpclient = HttpClients.createDefault();
		String uri = String.format("http://localhost:%s%s?", new Object[]{DEFAULT_PORT, DEFAULT_PATH});
		log.debug("uri:" + uri);
		HttpGet httpGet = new HttpGet(uri);
		CloseableHttpResponse response = null;
		try {
			response = httpclient.execute(httpGet);
		    //<...>
			log.debug("|||||||||||||||||||||||||");
			log.debug("response status:" + response.getStatusLine());
		} catch (ClientProtocolException e) {
			log.error(e.getMessage(), e);
		} catch (IOException e) {
			log.error(e.getMessage(), e);
		} finally {
		    try {
				response.close();
			} catch (IOException e) {
				log.error(e.getMessage(), e);
			}
		}
	}
	
	
}