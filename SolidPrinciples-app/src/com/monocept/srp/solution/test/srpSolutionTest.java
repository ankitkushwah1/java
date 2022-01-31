package com.monocept.srp.solution.test;

import com.monocept.srp.solution.InvoiceConsolePrinter;
import com.monocept.srp.solution.*;

public class srpSolutionTest {
	public static void main(String [] args) {
		Invoice invoice1 = new Invoice(1001, "Food Invoice",1000d, 10.0f, 5.0f);
		InvoiceConsolePrinter printer = new InvoiceConsolePrinter();
		printer.displayInvoice(invoice1);
	}
}
