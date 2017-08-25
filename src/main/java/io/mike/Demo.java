package io.mike;

import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

import com.google.common.cache.Cache;
import com.google.common.cache.CacheBuilder;
import com.google.common.cache.RemovalListener;
import com.google.common.cache.RemovalNotification;

import io.mike.cache.DataInfo;

/**
 * @author zhaoming
 *
 * 2017年8月25日 下午5:53:32
 */
public class Demo {

	public static void main(String[] args) {
		Cache<String, String> cache = CacheBuilder.newBuilder()
			.expireAfterWrite(3, TimeUnit.SECONDS)
			.removalListener(new RemovalListener<String, String>() {
				@Override
				public void onRemoval(RemovalNotification<String, String> notification) {
					System.out.println(notification);
				}
			})
			.build();

		try {
			for (int i = 0; i < 100; i++) {
				
				DataInfo<String> dataInfo = new DataInfo<String>("a", new Callable<String>() {
					@Override
					public String call() throws Exception {
						return "" + System.currentTimeMillis();
					}
				});
				
				String string = cache.get(dataInfo.getName(), dataInfo.getCallable());
				System.out.println(" => " + string);
				TimeUnit.SECONDS.sleep(1);
			}
		} catch (Throwable e) {
			e.printStackTrace();
		}
	}
}
