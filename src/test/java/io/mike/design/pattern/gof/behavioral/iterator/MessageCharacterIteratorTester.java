package io.mike.design.pattern.gof.behavioral.iterator;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import org.junit.Test;

/**
 * @author zhaoming
 *
 * 2017年8月28日 下午6:28:27
 */
public class MessageCharacterIteratorTester {

	@Test(expected = UnsupportedOperationException.class)
    public void test_remove(){
        MessageCharacterIterator messageCharacterIterator = new MessageCharacterIterator("hello".toCharArray());
        messageCharacterIterator.remove();
    }
	
	@Test
	public void test() {
		MessageCharacterIterator messageCharacterIterator = new MessageCharacterIterator("hello".toCharArray());
		StringBuilder sb = new StringBuilder();
		while (messageCharacterIterator.hasNext()) {
			sb.append(messageCharacterIterator.next());
			
		}
		assertThat(sb.toString(),is("hello"));
	}
	
	
}
