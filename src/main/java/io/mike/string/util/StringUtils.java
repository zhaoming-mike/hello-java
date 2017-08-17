package io.mike.string.util;

/**
 * @author zhaoming
 *
 * 2017年8月17日 下午5:01:26
 */
public class StringUtils {

	public static final int DEFAULT_LINE_STRING_TIMES = 100;
	
	public static String makeCharLine(int loopTimes) {
		return makeStringLine(loopTimes, "=");
	}
	
	public static String makeStringLine(int loopTimes, String str) {
		if (loopTimes < 0) loopTimes = -loopTimes;
		Math.min(loopTimes, DEFAULT_LINE_STRING_TIMES);
		StringBuilder sb = new StringBuilder();
		sb.append("\n");
		for (int i = 0; i < loopTimes; i++)
			sb.append(str);
		return sb.toString();
	}
	
	/**
	 * BIG_ENDIAN 
	 * like mysql function 
	 * 		SELECT INET_ATON('127.0.0.1'); 
	 *		SELECT INET_NTOA('2130706433'); 
	 * @param longIp
	 * @return
	 */
	public static String longToIp(long longIp) {
		StringBuilder sb = new StringBuilder();
		sb.append(longIp >>> 24);
		sb.append(".");
		sb.append((longIp & 0x00FF0000) >>> 16);
		sb.append(".");
		sb.append((longIp & 0x0000FF00) >>> 8);
		sb.append(".");
		sb.append(longIp & 0x000000FF);
		return sb.toString();
	}
	
	/**
	 * LITTLE_ENDIAN
	 * @param longIp
	 * @return
	 */
	public static String longToIp2(long longIp) {
		StringBuilder sb = new StringBuilder();
		sb.append(longIp & 0x000000FF);
		sb.append(".");
		sb.append((longIp & 0x0000FF00) >>> 8);
		sb.append(".");
		sb.append((longIp & 0x00FF0000) >>> 16);
		sb.append(".");
		sb.append(longIp >>> 24);
		return sb.toString();
	}

	/**
	 * BIG_ENDIAN
	 * @param strIp
	 * @return
	 */
	public static long ipToLong(String strIp) {
		long[] ip = new long[4];
		int position1 = strIp.indexOf(".");
		int position2 = strIp.indexOf(".", position1 + 1);
		int position3 = strIp.indexOf(".", position2 + 1);
		ip[0] = Long.parseLong(strIp.substring(0, position1));
		ip[1] = Long.parseLong(strIp.substring(position1 + 1, position2));
		ip[2] = Long.parseLong(strIp.substring(position2 + 1, position3));
		ip[3] = Long.parseLong(strIp.substring(position3 + 1));
		return (ip[0] << 24) + (ip[1] << 16) + (ip[2] << 8) + ip[3];
	}
	
	/**
	 * LITTLE_ENDIAN
	 * @param strIp
	 * @return
	 */
	public static long ipToLong2(String strIp) {
		long[] ip = new long[4];
		int position1 = strIp.indexOf(".");
		int position2 = strIp.indexOf(".", position1 + 1);
		int position3 = strIp.indexOf(".", position2 + 1);
		ip[0] = Long.parseLong(strIp.substring(0, position1));
		ip[1] = Long.parseLong(strIp.substring(position1 + 1, position2));
		ip[2] = Long.parseLong(strIp.substring(position2 + 1, position3));
		ip[3] = Long.parseLong(strIp.substring(position3 + 1));
		return (ip[3] << 24) + (ip[2] << 16) + (ip[1] << 8) + ip[0];
	}
	
	
}
