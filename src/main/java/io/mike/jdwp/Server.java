package io.mike.jdwp;

import java.util.concurrent.TimeUnit;

/**
 * 
 * VM参数填上以下内容：
 * 
 * 	jvm5+ => -agentlib:jdwp=transport=dt_shmem,address=6666,server=y,suspend=n
 * 	jvm5- => -Xdebug -Xrunjdwp:transport=dt_socket,server=y,suspend=y,address=6666
 * 
 * Run 本类的 main 方法 不用 debug 模式启动，否则会出现:JVM TI agent twice load
 * 
 * 命令行调试
 * 	jdb -attach 6666
 * 	stop at com.yy.Server:33	设置断点
 * 	clear com.yy.Server:33		清除断点
 * 	step						步入
 * 	next						单步
 * 	cont						跳出
 *  locals						显示线程的本地栈帧变量
 *  other 详见 help				https://docs.oracle.com/javase/7/docs/technotes/tools/solaris/jdb.html
 *  							https://www.ibm.com/developerworks/library/os-eclipse-javadebug 
 * @author zhaoming
 *
 * 2017年12月21日 下午4:22:39
 */
public class Server {
	
	public static void main(String[] args) {
		while(true) {
			
			doSomething();

			try {
				TimeUnit.SECONDS.sleep(3);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	private static void doSomething() {
		int total = 0;
		for (int i = 0; i < 10; i++) {
			total += i;
		}
		System.out.println("total:" + total);
	}
	
	
}
