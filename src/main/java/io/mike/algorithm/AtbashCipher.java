package io.mike.algorithm;

/**
 * @author zhaoming
 *
 * 2017年10月26日 下午3:49:10
 */
public class AtbashCipher {

	public static String transform(String string) {
		StringBuilder result = new StringBuilder();
		if(string == null)
			return null;
        for (char c : string.toCharArray()) {
            if (Character.isLetter(c)) {
                int newChar = ('Z' - c) + 'A';
                result.append((char) newChar);
            } else {
                result.append(c);
            }
        }
        return result.toString();
	}

}
