/**
 * Copyright (c) 2017 YY Inc.
 * All Rights Reserved.
 * This program is the confidential and proprietary information of 
 * YY Inc. ("Confidential Information"). You shall not disclose such
 * Confidential Information and shall use it only in accordance with
 * the terms of the license agreement you entered into with YY Inc.
 */
package io.mike.design.pattern.gof.structural.bridge;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;


/**
 * @author zhaoming
 *
 * 2017年9月6日 下午3:58:14
 */
public class HelloMessageBridgeTester {

	@Test
	public void test() throws Exception {
		
		//桥接很像代理、注意理解与之的差异。
		
		HelloMessageBridge helloMessageBridge = new HelloMessageBridge(null);
		assertThat(helloMessageBridge.encode(), is("Hello"));
		
		helloMessageBridge = new HelloMessageBridge(new HelloGitMessageBridgeImpl());
		assertThat(helloMessageBridge.encode(), is("Hello Git!"));
		
		helloMessageBridge = new HelloMessageBridge(new HelloMikeMessageBridgeImpl());
		assertThat(helloMessageBridge.encode(), is("Hello Mike!"));
		
	}
	
	
}
