package io.mike.http;

import java.io.IOException;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;

/**
 * 请求控制器
 * @author zhaoming
 *
 */
@SuppressWarnings("restriction")
public class HelloHttpHandler implements HttpHandler {

	@Override
	public void handle(HttpExchange httpExchange) throws IOException {
		Map<String, String> params = queryToMap(httpExchange.getRequestURI().getQuery());
		StringBuilder sb = new StringBuilder();
		sb.append("<h3>Hello World!</h3>\r\n");
		printAllQueryString(sb, params);
		httpExchange.sendResponseHeaders(200, sb.toString().length());
		OutputStream os = httpExchange.getResponseBody();
		os.write(sb.toString().getBytes());
		os.close();
	}

	private void printAllQueryString(StringBuilder sb, Map<String, String> params) {
		if(null == params) return;
		Iterator<Entry<String, String>> iterator = params.entrySet().iterator();
		while(iterator.hasNext()) {
			Entry<String, String> next = iterator.next();
			sb.append("key:" + next.getKey());
			sb.append("\tvalue:" + next.getValue());
			sb.append("\r\n");
		}
	}

	public Map<String, String> queryToMap(String query) {
		Map<String, String> result = new HashMap<>();
		for (String param : query.split("&")) {
			String pair[] = param.split("=");
			if (pair.length > 1) {
				result.put(pair[0], pair[1]);
			} else {
				result.put(pair[0], "");
			}
		}
		return result;
	}
}