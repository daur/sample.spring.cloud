package com.learning.sample.feign.client;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;

public class TestMain {

	public static void main(String[] args) throws IOException {
		URL url = new URL("http://192.168.1.237:8871/greeting");
	    HttpURLConnection connection = (HttpURLConnection) url.openConnection();
	    connection.setRequestMethod("GET");
	    connection.connect();

	    int code = connection.getResponseCode();
	    System.out.println("Response code of the object is " + code);
	    if (code == 200) {
	        System.out.println("OK");
	    }
	}
}
