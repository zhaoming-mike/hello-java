package io.mike.algorithm;

import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;

import org.apache.commons.codec.binary.Base32;
import org.apache.commons.codec.binary.Base64;
import org.junit.Test;
import org.springframework.util.Base64Utils;

import com.google.common.io.BaseEncoding;

public class BaseXXXTester {

	/** 
	 * http://www.thefullwiki.org/Base-16
	 * hexadecimal (base 16 or hex) is a positional numeral system with a radix
	 */
	@Test
	public void test_base16() throws Exception {
		BaseEncoding base16 = BaseEncoding.base16();
		String msg = "68656C6C6F";
//		String msg = "F963UF91XXF59Y9F6211F6765F4V86";
		boolean canDecode = base16		.canDecode(msg);
		System.out.println(canDecode);
		if(canDecode) {
			byte[] decode = base16.decode(msg);
			String m = new String(decode);
			System.out.println(m);
			assertThat(m, is("hello"));
		}
	}
	
	@Test
	public void test_base64() {
		System.out.println(Base64Utils.encodeToString("祝你节日快乐".getBytes()));
		
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
		System.out.println(new String(Base64.decodeBase64(all)));
	}
	
}
