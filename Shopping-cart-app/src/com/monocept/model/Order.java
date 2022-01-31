package com.monocept.model;

import java.sql.Date;

import java.util.*;

public class Order {
	
	private int id;
	private Date date;
	private List<LineItem> orderItems = new ArrayList<LineItem>();
	
	public Order( int id,Date date) {
		this.id = id;
		this.date = date;
		
	}
	
	public int getId() {
		return id;
	}
	
	public Date getDate() {
		 return date;
	}
	
	public  List getOrderItems() {
		return orderItems;
	}
	
	public void addItem(LineItem item) {
		this.orderItems.add(item);
	}
	
	public int itemCount() {
		return(orderItems.size());
	}
	
	public double checkOutCost() {
		double totalCost =0;
		for(LineItem item : this.orderItems) {
			totalCost+=item.calculateLineItemCost();
		}
		return totalCost;
	}
}
