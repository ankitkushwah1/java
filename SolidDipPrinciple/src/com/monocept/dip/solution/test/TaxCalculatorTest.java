package com.monocept.dip.solution.test;

import com.monocept.dip.solution.FileLogger;
import com.monocept.dip.solution.TaxCalculator;

public class TaxCalculatorTest {
	public static void main(String [] args) {
		TaxCalculator calc = new TaxCalculator(new FileLogger());
		calc.calculateTax(10, 0);
	}
}
