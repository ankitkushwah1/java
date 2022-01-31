package com.monocept.ocp.solution;

import com.monocept.ocp.solution.*;
import com.monocept.ocp.solution.FixedDeopsit;
public class FixedDepositeConsolePrint {
	public void displayFdDetails(Object obj) {
		
		FixedDeopsit  fd = (FixedDeopsit)obj;
		System.out.println("Account no :" +fd.getAccno());
		System.out.println("Name : "+fd.getName());
		System.out.println("Principle : "+fd.getPrinciple());
		System.out.println("Duration : "+fd.getDuration());
		System.out.println("Festival : "+fd.getFestival());
		System.out.println("Rate : "+fd.calculateRate());
		System.out.println("Simple intrest : "+fd.calculateSimpleIntrest());
		System.out.println();
	}
}
