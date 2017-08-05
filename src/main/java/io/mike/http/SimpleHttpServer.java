package io.mike.http;

import java.io.IOException;
import java.net.InetSocketAddress;

import com.sun.net.httpserver.*;

public class SimpleHttpServer {

	@SuppressWarnings("restriction")
	public static void main(String[] args) {
		try {
			HttpServer httpServer = HttpServer.create(new InetSocketAddress(8888), 0);
			httpServer.createContext("/hello", new HelloHttpHandler());
			httpServer.setExecutor(null);
			httpServer.start();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public int times(int n) {
		return n * 10;
	}

}