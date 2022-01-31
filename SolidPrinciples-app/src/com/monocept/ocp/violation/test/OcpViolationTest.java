package com.monocept.ocp.violation.test;

import com.monocept.ocp.violation.FestivalType;
import com.monocept.ocp.violation.FixedDeposit;
import com.monocept.ocp.violation.FixedDepositeConsolePrint;

public class OcpViolationTest {
	public static void main(String [] args) {
		
		FixedDeposit fd1 = new FixedDeposit(1001, "Ankit", 100000d, 5, FestivalType.Diwali);
		FixedDepositeConsolePrint printer = new FixedDepositeConsolePrint();
		printer.displayFdDetails(fd1);
		
		FixedDeposit fd2 = new FixedDeposit(1002, "Sanjeev", 100000d, 4, FestivalType.EID);
		printer.displayFdDetails(fd2);
		
		FixedDeposit fd3 = new FixedDeposit(1003, "manoj", 100000d, 3, FestivalType.Normal);
		printer.displayFdDetails(fd3);
	}
}
