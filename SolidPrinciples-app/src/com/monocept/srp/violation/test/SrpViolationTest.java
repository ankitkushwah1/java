package com.monocept.srp.violation.test;

import com.monocept.srp.violation.Invoice;

public class SrpViolationTest {
	public static void main(String [] args) {
		Invoice invoice1 = new Invoice(1001, "Food Invoice",1000d, 10.0f, 5.0f);
		invoice1.displayInvoice();
	}
}
