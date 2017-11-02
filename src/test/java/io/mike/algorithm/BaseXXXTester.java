package io.mike.algorithm;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import java.security.MessageDigest;

import org.apache.commons.codec.binary.Base64;
import org.junit.Assert;
import org.junit.Test;

import com.google.common.io.BaseEncoding;

public class BaseXXXTester {

	/**
	  * 客户端请求
	  *		GET / HTTP/1.1
	  *		Upgrade: websocket
	  *		Connection: Upgrade
	  *		Host: example.com
	  *		Origin: http://example.com
	  *		Sec-WebSocket-Key: sN9cRrP/n9NdMgdcy2VJFQ==
	  *		Sec-WebSocket-Version: 13
	  *		
	  *	服务器响应
	  *		HTTP/1.1 101 Switching Protocols
	  *		Upgrade: websocket
	  *		Connection: Upgrade
	  *		Sec-WebSocket-Accept: fFBooB7FAkLlXgRSz0BT3v4hq5s=
	  *		Sec-WebSocket-Location: ws://example.com/
	  */
	@Test
	public void test_websocket_handshake() {
		/** 特殊字符串 */
		String specialStr = "258EAFA5-E914-47DA-95CA-C5AB0DC85B11";
		/** 随机字符串 */
		String secWebSocketKey = "sN9cRrP/n9NdMgdcy2VJFQ==";
		/** 服务器计算：Base64(SHA-1(secWebSocketKey + specialString)) */
		String secWebSocketAccept = "fFBooB7FAkLlXgRSz0BT3v4hq5s=";
		try {
			String msg = secWebSocketKey + specialStr;
			byte[] msgBytes = msg.getBytes("UTF-8");
			byte[] msgBytesSHA1 = MessageDigest.getInstance("SHA-1").digest(msgBytes);
			byte[] msgBytesSHA1Base64 = Base64.encodeBase64(msgBytesSHA1);
			String actual = new String(msgBytesSHA1Base64);
			System.out.println("actual:" + actual);
			Assert.assertEquals(secWebSocketAccept, actual);
		} catch (Throwable e) {
			e.printStackTrace();
		}
	}
	
	/** 
	 * http://www.thefullwiki.org/Base-16
	 * hexadecimal (base 16 or hex) is a positional numeral system with a radix
	 */
	@Test
	public void test_base16() throws Exception {
		BaseEncoding base16 = BaseEncoding.base16();
		String msg = "68656C6C6F";
		boolean canDecode = base16		.canDecode(msg);
		if(canDecode) {
			byte[] decode = base16.decode(msg);
			String m = new String(decode);
			assertThat(m, is("hello"));
		}
	}
	
	@Test
	public void test_1024() {
		String a1 = "F963U"; 
		String a2 = "F91XX";
		String a3 = "F59Y9";
		String a4 = "F6211";
		String a5 = "F6765";
		String a6 = "F4V86";
		String all = a1 + a2 + a3 + a4 + a5 + a6;
		System.out.println(all);
		String a = io.mike.algorithm.AtbashCipher.transform(all);
		String[] split = a.split("U");
		for(String each : split) {
			if(each.length() < 4)
				continue;
			int codePoint = Integer.parseInt(each, 16);
			char[]  chs = Character.toChars(codePoint);
			System.out.print(chs[0]);
		}
		System.out.println();
	}
	
}
