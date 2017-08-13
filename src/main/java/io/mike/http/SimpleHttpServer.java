package io.mike.http;

import java.io.IOException;
import java.net.InetSocketAddress;

import com.sun.net.httpserver.*;

public class SimpleHttpServer {

	@SuppressWarnings("restriction")
	public static void main(String[] args) {
		try {
			String path = "/hello";
			int port = 8888;
			if(args.length == 2) {
				try {
					path = "/" + args[0];
					port = Integer.parseInt(args[1]);
				} catch (Exception e) {
					//eat it.
				}
			}
			HttpServer httpServer = HttpServer.create(new InetSocketAddress(port), 0);
			httpServer.createContext(path, new HelloHttpHandler());
			httpServer.setExecutor(null);
			httpServer.start();
			System.out.println("http server started on port:" + port);
			System.out.println("http server default path:" + path);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public int times(int n) {
		return n * 10;
	}

}