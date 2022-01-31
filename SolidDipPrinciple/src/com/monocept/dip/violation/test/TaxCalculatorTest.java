package com.monocept.dip.violation.test;

import com.monocept.dip.violation.ErrorLogType;
import com.monocept.dip.violation.TaxCalculator;

public class TaxCalculatorTest {
	public static void main(String [] args) {
		TaxCalculator calc = new TaxCalculator(ErrorLogType.File);
		System.out.println(calc.calculateTax(10, 0));
	}
}
