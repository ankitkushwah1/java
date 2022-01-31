package com.monocept.model;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

public class UrlLoader implements Strategy {
	
	private String urlAddress;
	
	public UrlLoader(String urlAddress) {
		this.urlAddress =urlAddress;
	}
	
	@Override
	public void read() {
		
		StringBuilder  sb = new StringBuilder();
		
		try {
			
			URL url = new URL(this.urlAddress);
			URLConnection urlConnection = url.openConnection();
			BufferedReader reader = new BufferedReader(new InputStreamReader(urlConnection.getInputStream()));
			String line = null;
			while((line = reader.readLine())!=null) {
				EmployeeAnalyzer.details.add(line);
			}
			reader.close();
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
