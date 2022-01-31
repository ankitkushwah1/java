package com.monocept.srp.violation;



public class Invoice {
	
	private int id;
	private String description;
	private double amount;
	private float discountPercentage;
	private float taxPercentage;
	
	public Invoice(int id,String description,double amount,float discountPercentage,float taxPercentage) {
		this.id = id;
		this.description = description;
		this.amount = amount;
		this.discountPercentage = discountPercentage;
		this.taxPercentage = taxPercentage;
	}
	
	public int getId() {
		return id;
	}
	
	public String getDescription() {
		return description;
	}
	
	public double getAmount() {
		return amount;
	}
	
	public float getDiscountPercentage() {
		return discountPercentage;
	}
	
	public float getTaxPercentage() {
		return taxPercentage;
	}
	
	public double calculateDiscount() {
		return(this.amount - (this.amount*this.discountPercentage)/100);
	}
	public double calculateTax() {
		return((this.calculateDiscount()*this.taxPercentage)/100);
	}
	
	public double calculateTotal() {
		return(this.amount - this.calculateDiscount() + this.calculateTax());
	}
	
	public void displayInvoice() {
		System.out.println("Id : "+this.id);
		System.out.println("Description : "+this.description);
		System.out.println("Amount : "+this.amount);
		System.out.println("Discount amount : "+this.calculateDiscount());
		System.out.println("Tax amount : "+this.calculateTax());
		System.out.println("Total amount : "+this.calculateTotal());
	}
	
	
}
