package com.monocept.dip.solution;

public class EmailLogger implements ILogger {

	@Override
	public void log(String msg) {
		System.out.println("Email : "+msg);
	}
}
