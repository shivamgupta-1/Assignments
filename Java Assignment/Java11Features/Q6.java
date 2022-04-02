package Java11Features;
/*
 * Write a code using HttpClient API which sends a GET request
to https://httpbin.org/get, and print out the response header, status code, and
body for the given URL.
Sample output could be (Note: date and other attribute values may differ in your
results):
access-control-allow-credentials:[true]
access-control-allow-origin:[*]
connection:[keep-alive]
content-length:[273]
content-type:[application/json]
date:[Fri, 06 Aug 2021 13:07:41 GMT]
server:[gunicorn/19.9.0]
200
{
 "args": {},
 "headers": {
 "Content-Length": "0",
 "Host": "httpbin.org",
 "User-Agent": "Java 11 HttpClient Bot",
 "X-Amzn-Trace-Id": "Root=1-610d341d-092dc33f698b192a219426d1"
 },
 "origin": "43.255.221.184",
 "url": "https://httpbin.org/get"
} 
 */

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.net.URLConnection;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpClient.Version;
import java.net.http.HttpResponse.BodyHandlers;
import java.util.List;
import java.util.Map;

public class Q6 {

	public static void main(String[] args) throws IOException ,InterruptedException   {
		String uri="https://httpbin.org/get";
		URL url=new URL(uri);
		URLConnection conn=url.openConnection();
		Map<String, List<String>> map = conn.getHeaderFields();
		HttpRequest req=HttpRequest.newBuilder()
				.uri(URI.create(uri))
				.GET()
				.build();
		HttpClient client=HttpClient.newBuilder()
				.build();
		try {
			HttpResponse<String> resp=client.send(req, BodyHandlers.ofString());
			for (Map.Entry<String, List<String>> entry : map.entrySet()) {
				System.out.println(entry.getKey() + " : " + entry.getValue());
			}
			System.out.println(resp.statusCode());
			System.out.println(resp.body());
		} 
		finally {
			System.out.println();
		}

	}
}


