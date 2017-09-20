package io.mike.algorithm;

import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;
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
	
	
}
