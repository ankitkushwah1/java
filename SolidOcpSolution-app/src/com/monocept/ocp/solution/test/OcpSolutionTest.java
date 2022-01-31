package com.monocept.ocp.solution.test;

import com.monocept.ocp.solution.DiwaliRatePolicy;
import com.monocept.ocp.solution.EidRatePolicy;
import com.monocept.ocp.solution.FixedDeposite;
import com.monocept.ocp.solution.FixedDepositeConsolePrinter;
import com.monocept.ocp.solution.IFestivalRatePolicy;
import com.monocept.ocp.solution.NormalRatePolicy;

public class OcpSolutionTest {
	public static void main (String [] args) {
		
		FixedDeposite fd1 = new FixedDeposite(1001, "Ankit", 100000, 5, new NormalRatePolicy());
		FixedDepositeConsolePrinter printer = new FixedDepositeConsolePrinter();
		printer.displayFdDetails(fd1);
		
		FixedDeposite fd2 = new FixedDeposite(1002,"Fiasal", 100000, 5, new EidRatePolicy());
		printer.displayFdDetails(fd2);
		
		FixedDeposite fd3 = new FixedDeposite(1003, "Asif", 100000, 5, new DiwaliRatePolicy());
		printer.displayFdDetails(fd3);
		
	}
}
