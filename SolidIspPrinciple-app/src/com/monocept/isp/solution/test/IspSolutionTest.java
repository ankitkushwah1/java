package com.monocept.isp.solution.test;

import com.monocept.isp.solution.*;


public class IspSolutionTest {
	public static void main(String [] args) {
		Manager m = new Manager();
		Robot b = new Robot();
		atTheWorKStation(m);
		atTheWorKStation(b);
		atTheWorCafeteria(m);
		
		
		
	}
	
	public static void  atTheWorKStation(IWorkable worker) {
		System.out.println("At the workstation");
		worker.startWork();
		worker.stopWork();
		System.out.println();
	}
	
	public static void  atTheWorCafeteria(IEatable worker) {
		System.out.println("At the Cafeteria");
		worker.startEat();
		worker.stopEat();
		System.out.println();
	}
}
