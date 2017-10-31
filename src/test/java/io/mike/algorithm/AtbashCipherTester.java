package io.mike.algorithm;

import static org.junit.Assert.*;
import org.junit.Test;

/**
 * @author zhaoming
 *
 *         2017年10月26日 下午3:49:38
 */
public class AtbashCipherTester {

	@Test
	public void test_transform() {
         String str = "\u554A";//啊 字的unicode
         System.out.println(str);
         int codePoint = Integer.parseInt("554A", 16);
         char[]  chs = Character.toChars(codePoint);
         System.out.println(chs[0]);
	}
	
	@Test
	public void test_transform_null() {
		String encode = AtbashCipher.transform(null);
		assertEquals(null, encode);
	}
	
	@Test
	public void test_transform_one() {
		String encode = AtbashCipher.transform("ZYX");
		assertEquals("ABC", encode);
	}

	@Test
	public void test_transform_two() {
		String encode = AtbashCipher.transform("ABC");
		assertEquals("ZYX", encode);
	}
	
	

}
