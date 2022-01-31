package com.monocept.isp.violation.test;

import com.monocept.isp.violation.IWorker;
import com.monocept.isp.violation.Manager;
import com.monocept.isp.violation.Robot;

public class IspViolationTest {

	public static void main (String [] args) {
		Manager m = new Manager();
		Robot b = new Robot();
		atTheWorKStation(m);
		atTheWorKStation(b);
		atTheWorCafeteria(m);
		atTheWorCafeteria(b);
	}
	
	public static void  atTheWorKStation(IWorker worker) {
		System.out.println("At the workstation");
		worker.startWork();
		worker.stopWork();
		System.out.println();
	}
	
	public static void  atTheWorCafeteria(IWorker worker) {
		System.out.println("At the Cafeteria");
		worker.startEat();
		worker.stopEat();
		System.out.println();
	}
	
}
