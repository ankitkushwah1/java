package com.monocept.model.test;

import com.monocept.model.Singleton;

public class SingletonPatternTest {
	public static void main(String [] args) {
		
		Singleton object = Singleton.getInstance();
		object.showMessage();
	}
}
