package com.monocept.model;

import java.util.*;

public class Customer {
	
	private int id;
	private String name;
	private List<Order> orders = new ArrayList<Order>();
	
	public Customer(int id, String name) {
		this.id = id ;
		this.name = name;
		
	}
	
	public int getId() {
		return id;
		
	}
	
	public String getName() {
		return name;
	}
	 
	public List getOrders() {
		return orders;
	}
	
	public void addOrder(Order order) {
		this.orders.add(order);
	}
	
	public int orderCount() {
		return (this.orders.size());
	}
	
	public double calculateTotalCost() {
		double TotalCost = 0;
		for(Order order :this.orders) {
			TotalCost+=(order.checkOutCost());
		}
		return TotalCost;
	}
}
