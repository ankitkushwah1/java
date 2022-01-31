package com.monocept.ocp.solution;

public class FixedDepositeConsolePrinter {
	public void displayFdDetails(Object obj) {
		
		FixedDeposite  fd = (FixedDeposite)obj;
		System.out.println("Account no :" +fd.getAccno());
		System.out.println("Name : "+fd.getName());
		System.out.println("Principle : "+fd.getPrinciple());
		System.out.println("Duration : "+fd.getDuration());
		System.out.println("Festival : "+fd.getFestival());
		System.out.println("Rate : "+fd.getFestival().calculateRate());
		System.out.println("Simple intrest : "+fd.calculateSimpleIntrest());
		System.out.println();
	}
}
