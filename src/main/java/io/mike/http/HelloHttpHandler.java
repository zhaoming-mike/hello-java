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
 * e.g.
 * 		http://127.0.0.1:8888/hello?github=https://www.github.com&localhost=http://localhost:8888/hello?a=1
 * @author zhaoming
 *
 */
@SuppressWarnings("restriction")
public class HelloHttpHandler implements HttpHandler {

	@Override
	public void handle(HttpExchange httpExchange) throws IOException {
		Map<String, String> params = queryToMap(httpExchange.getRequestURI().getQuery());
		StringBuilder sb = new StringBuilder();
		printHtml(params, sb);
		httpExchange.sendResponseHeaders(200, sb.toString().length());
		OutputStream os = httpExchange.getResponseBody();
		os.write(sb.toString().getBytes());
		os.close();
	}

	private void printHtml(Map<String, String> params, StringBuilder sb) {
		sb.append("<html>");
		sb.append("<title>Hello World!</title>");
		sb.append("<body>");
		sb.append("<h3>Hello World!</h3>");
		printAllQueryString(sb, params);
		sb.append("</body>");
		sb.append("</html>");
	}

	private void printAllQueryString(StringBuilder sb, Map<String, String> params) {
		if(null == params) return;
		Iterator<Entry<String, String>> iterator = params.entrySet().iterator();
		while(iterator.hasNext()) {
			Entry<String, String> next = iterator.next();
			sb.append("<a href=" + next.getValue() +">");
			sb.append(next.getKey());
			sb.append("</a></br>");
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