package com.monocept.model;

import java.io.*;


public class FileLoader implements Strategy{
	private String fileAddress;
	public FileLoader(String fileAddress) {
		
		this.fileAddress = fileAddress;
	}
	@Override
	public void read() {
		try {
			File file =  new File(this.fileAddress);
			BufferedReader reader = new BufferedReader(new FileReader(file));
			String line = null;
			while((line = reader.readLine())!=null) {
				EmployeeAnalyzer.details.add(line);
			}
			reader.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
}
