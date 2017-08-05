package io.mike.http;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import com.sun.net.httpserver.*;

@SuppressWarnings("restriction")
public class HelloHttpHandler implements HttpHandler {

	@Override
	public void handle(HttpExchange httpExchange) throws IOException {
		InputStream is = httpExchange.getRequestBody();
        byte[] temp = new byte[is.available()];
        is.read(temp);
        String inputString = new String(temp);
        String response = "<h3>Hello World! " + inputString + "</h3>";
        httpExchange.sendResponseHeaders(200, response.length());
        OutputStream os = httpExchange.getResponseBody();
        os.write(response.getBytes());
        os.close();
	}


}