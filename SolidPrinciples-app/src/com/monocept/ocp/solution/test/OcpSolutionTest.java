package com.monocept.ocp.solution.test;

import com.monocept.ocp.solution.FixedDeopsit;
import com.monocept.ocp.solution.DiwaliOffer;
import com.monocept.ocp.solution.EidOffer;
import com.monocept.ocp.solution.FestivalType;
import com.monocept.ocp.solution.FixedDepositeConsolePrint;
public class OcpSolutionTest {
	public static void main(String [] args) {
		
		FixedDeopsit fd1 = new FixedDeopsit(1001, "Ankit", 100000d, 5, FestivalType.Diwali);
		FixedDepositeConsolePrint printer = new FixedDepositeConsolePrint();
		printer.displayFdDetails(fd1);
		
		EidOffer fd2 = new EidOffer(1002, "Sanjeev", 100000d, 4, FestivalType.EID);
		printer.displayFdDetails(fd2);
		
		DiwaliOffer fd3 = new DiwaliOffer(1003, "manoj", 100000d, 3, FestivalType.Normal);
		printer.displayFdDetails(fd3);
	}
}
