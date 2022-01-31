package com.monocept.srp.solution;

public class InvoiceConsolePrinter {
	
	public void displayInvoice(Object obj) {
		Invoice invoice = (Invoice)obj;
		System.out.println("Id : "+invoice.getId());
		System.out.println("Description : "+invoice.getDescription());
		System.out.println("Amount : "+invoice.getAmount());
		System.out.println("Discount amount : "+invoice.calculateDiscount());
		System.out.println("Tax amount : "+invoice.calculateTax());
		System.out.println("Total amount : "+invoice.calculateTotal());
	}
}
