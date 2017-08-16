package io.mike.http.server;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.util.concurrent.TimeUnit;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.sun.net.httpserver.*;

import io.mike.http.server.handler.HelloHttpHandler;

@SuppressWarnings("restriction")
public class SimpleHttpServer {

	private static final Logger log = LoggerFactory.getLogger(SimpleHttpServer.class);
	
	static volatile HttpServer httpServer = null;
	static final int STOP_DELAY_DEFAULT_SECOND = 3;
	
	public static void startServer() {
		main(null);
	}
	public static void startServer(int port, String path) {
		if(httpServer != null) {
			log.error("http server is already started.");
		}
		try {
			httpServer = HttpServer.create(new InetSocketAddress(port), 0);
			httpServer.createContext(path, new HelloHttpHandler());
			httpServer.setExecutor(null);
			httpServer.start();
			printLines();
			log.info("http server started on port:" + port);
			log.info("http server path:" + path);
			beforeShutdown();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	private static void printLines() {
		StringBuilder sb = new StringBuilder();
		sb.append("\r\n");
		sb.append("\r\n");
		for (int i = 0; i < 100; i++) {
			sb.append("=");
		}
		log.info(sb.toString());
	}

	private static void beforeShutdown() {
		Runtime.getRuntime().addShutdownHook(new Thread() {
			@Override
			public void run() {
				SimpleHttpServer.stopServer();
			}
			
		});
	}
	
	public static void stopServer() {
		if(httpServer == null) {
			log.info("no http server need to stop.");
		}
		
		printCountDownInfo();
		
		httpServer.stop(STOP_DELAY_DEFAULT_SECOND);
		log.info("http server is stopped.");
	}
	
	private static void printCountDownInfo() {
		new Thread() {
			@Override
			public void run() {
				for (int i = STOP_DELAY_DEFAULT_SECOND; i > 0 ; i--) {
					log.info(String.format("http server will stop after %s seconds.", i));
					try {
						TimeUnit.SECONDS.sleep(1);
					} catch (InterruptedException e) {
						log.error(e.getMessage(), e);
					}
				}
			}
		}.start();
	}
	
	public static void main(String[] args) {
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
		startServer(port, path);
	}

	public int times(int n) {
		return n * 10;
	}

	
}