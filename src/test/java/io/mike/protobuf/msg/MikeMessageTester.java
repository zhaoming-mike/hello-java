package io.mike.protobuf.msg;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

import org.junit.Assert;
import org.junit.Test;

import io.mike.protobuf.msg.MikeMessage.HelloWorld;
import io.mike.protobuf.msg.MikeMessage.HelloWorld.Builder;

/**
 * Google protobuf software framework 示例 
 * @author zhaoming
 *
 * 2017年11月3日 下午3:07:22
 */
public class MikeMessageTester {
	public static final int ID = 1;
	public static final String MESSAGE = "Hello";

	@Test
	public void test() throws IOException {
		
		HelloWorld helloWorld = makeObject(ID, MESSAGE);
		
		ByteArrayInputStream helloWorldBytesFromNetwork = mockNetworkTransport(helloWorld, false);
		
		MikeMessage.HelloWorld helloWorldFromNetwork = MikeMessage.HelloWorld.parseFrom(helloWorldBytesFromNetwork);
		
		Assert.assertEquals(MESSAGE, helloWorldFromNetwork.getMessage());
		Assert.assertEquals(ID, helloWorldFromNetwork.getId());
	}
	
	@Test
	public void test_hack() throws IOException {
		
		HelloWorld helloWorld = makeObject(ID, MESSAGE);

        ByteArrayInputStream helloWorldBytesFromNetwork = mockNetworkTransport(helloWorld, true);

        MikeMessage.HelloWorld helloWorldFromNetwork = MikeMessage.HelloWorld.parseFrom(helloWorldBytesFromNetwork);
        
        Assert.assertEquals("Aello", helloWorldFromNetwork.getMessage());
        Assert.assertEquals(ID, helloWorldFromNetwork.getId());
	}

	/**
	 * 模拟网络传输
	 * @param helloWorld
	 * @return
	 * @throws IOException
	 */
	private ByteArrayInputStream mockNetworkTransport(HelloWorld helloWorld, boolean isHack) throws IOException {
		
		ByteArrayOutputStream helloWorldBytes = new ByteArrayOutputStream();
        helloWorld.writeTo(helloWorldBytes);
        
        byte[] helloWorldByteArray = helloWorldBytes.toByteArray();
        
        byte[] temp = new byte[helloWorldByteArray.length];
        //System.out.println(temp.length);
        for (int i = 0; i < helloWorldByteArray.length; i++) {
        	if(i == 4) {
        		//篡改 Hello 的 H 为 A
        		temp[i] = 65;
        	} else {
        		temp[i] = helloWorldByteArray[i];
        	}
		}
        
        ByteArrayInputStream helloWorldBytesFromNetwork = new ByteArrayInputStream(helloWorldByteArray);
        ByteArrayInputStream helloWorldBytesFromNetworkHack = new ByteArrayInputStream(temp);
        
		return isHack ? helloWorldBytesFromNetworkHack : helloWorldBytesFromNetwork;
	}

	/**
	 * 构建PB对象
	 * @return
	 */
	private HelloWorld makeObject(int id, String message) {
		Builder helloWorldBuilder = MikeMessage.HelloWorld.newBuilder();
		helloWorldBuilder.setId(id);
		helloWorldBuilder.setMessage(message);
		HelloWorld helloWorld = helloWorldBuilder.build();
		return helloWorld;
	}
	
	
}
