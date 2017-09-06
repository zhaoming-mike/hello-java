/**
 * Copyright (c) 2017 YY Inc.
 * All Rights Reserved.
 * This program is the confidential and proprietary information of 
 * YY Inc. ("Confidential Information"). You shall not disclose such
 * Confidential Information and shall use it only in accordance with
 * the terms of the license agreement you entered into with YY Inc.
 */
package io.mike.design.pattern.gof.structural.bridge;

import io.mike.design.pattern.gof.Message;

/**
 * @author zhaoming
 *
 * 2017年9月6日 下午3:56:55
 */
public class HelloMessageBridge implements Message {

	private IHelloMessageBridge helloMessageBridge;
	
	public HelloMessageBridge(IHelloMessageBridge helloMessageBridge) {
		this.helloMessageBridge = helloMessageBridge;
	}
	
	@Override
	public String encode() {
		if(helloMessageBridge != null) return helloMessageBridge.getMessage(); 
		return "Hello";
	}

}
