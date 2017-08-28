package io.mike.design.pattern.gof.behavioral.iterator;

import java.util.Iterator;

/**
 * @author zhaoming
 *
 * 2017年8月28日 下午6:20:54
 */
public class MessageCharacterIterator implements Iterator<Character> {

	private char[] characters;

    private int size;

    private int index;
    
	public MessageCharacterIterator(char[] characters) {
		this.characters = characters;
        this.size = characters.length;
        this.index = 0;
	}
	
	@Override
	public boolean hasNext() {
		return index < size;
	}

	@Override
	public Character next() {
		return characters[index++];
	}

	@Override
	public void remove() {
		throw new UnsupportedOperationException("remove not support!");
	}


}
