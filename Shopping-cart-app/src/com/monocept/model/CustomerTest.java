package com.monocept.model;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
public class CustomerTest {
	
	@Test
	public void constructorCheck() {
		
		Customer  customer = new Customer(1001, "FAISAL");
		
		int expectedId = 1001;
		String expectedName = "FAISAL";
		
		assertEquals(expectedId, customer.getId());
		assertEquals(expectedName, customer.getName());
		
	}
	
	@Test
	public void addItemCheck() {
		
		Product product = new Product(1001, "Cup", 100, 5.0f);
		LineItem item = new LineItem(1001, product, 2);
		Order order = new Order(1001, new Date(2021,10,21));
		order.addItem(item);
		List<Order> orderList = new ArrayList<Order>();
		int excpectedordersCount =0;
		
		Customer  customer = new Customer(1001, "FAISAL");
		assertEquals(excpectedordersCount, customer.orderCount());
		excpectedordersCount =1;
		customer.addOrder(order);
		assertEquals(excpectedordersCount, customer.orderCount());
		
		orderList.add(order);
		assertEquals(orderList, customer.getOrders());
		
	}
	
	@Test
	public void TotalCostTest() {
		Product product = new Product(1001, "Cup", 100, 5.0f);
		LineItem item = new LineItem(1001, product, 2);
		Order order = new Order(1001, new Date(2021,10,21));
		order.addItem(item);
		List<Order> orderList = new ArrayList<Order>();
		Customer  customer = new Customer(1001, "FAISAL");
		customer.addOrder(order);
		double	expectedTotalCost =190;
		assertEquals(expectedTotalCost, customer.calculateTotalCost());
		
	}
	
	
}
