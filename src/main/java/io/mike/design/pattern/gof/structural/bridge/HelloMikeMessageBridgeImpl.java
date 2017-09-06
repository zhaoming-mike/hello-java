/**
 * Copyright (c) 2017 YY Inc.
 * All Rights Reserved.
 * This program is the confidential and proprietary information of 
 * YY Inc. ("Confidential Information"). You shall not disclose such
 * Confidential Information and shall use it only in accordance with
 * the terms of the license agreement you entered into with YY Inc.
 */
package io.mike.design.pattern.gof.structural.bridge;

/**
 * @author zhaoming
 *
 * 2017年9月6日 下午4:00:35
 */
public class HelloMikeMessageBridgeImpl implements IHelloMessageBridge {

	@Override
	public String getMessage() {
		return "Hello Mike!";
	}

}
