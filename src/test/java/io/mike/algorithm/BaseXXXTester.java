package io.mike.algorithm;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import org.junit.Test;

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
