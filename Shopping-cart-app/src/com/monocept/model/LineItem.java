package com.monocept.model;



public class LineItem {
	
	private int id;
	private Product product;
	private int quantity;
	
	public LineItem(int id,Product product,int quantity) {
		this.id = id;
		this.product = product;
		this.quantity = quantity;
	}
	
	public int getId() {
		return id;
	}
	
	public Product getProduct() {
		return product;
	}
	
	public int getQuantity() {
		return quantity;
	}
	
	public double calculateLineItemCost() {
		return(this.product.costAfterDiscount()*quantity);
	}
}
