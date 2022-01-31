package com.monocept.model;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.sql.Date;
import java.util.*;

import org.junit.jupiter.api.Test;


public class OrderItemTest {

	@Test 
	public void constaructorCheck() {
		Product product = new Product(1001, "Cup", 100, 5.0f);
		LineItem item = new LineItem(1001, product, 2);
		Order order = new Order(1001, new Date(2021,10,21));
		
		int exepectedId = 1001;
		Date excpectedDate = new Date(2021,10,21);
		
		assertEquals(exepectedId, order.getId());
		assertEquals(excpectedDate, order.getDate());
	}
	
	@Test 
	public void addItems() {
		
		Product product = new Product(1001, "Cup", 100, 5.0f);
		LineItem item = new LineItem(1001, product, 2);
		Order order = new Order(1001, new Date(2021,10,21));
		int	exepectedItemCount =0;
		
		assertEquals(exepectedItemCount, order.itemCount());
		order.addItem(item);
		exepectedItemCount=1;
		assertEquals(exepectedItemCount, order.itemCount());
		List <LineItem> expectedItem = new ArrayList<LineItem>();
		expectedItem.add(item);
		assertEquals(expectedItem, order.getOrderItems());
		
	}
	
	public void checkOutCostTest() {
		Product product = new Product(1001, "Cup", 100, 5.0f);
		LineItem item = new LineItem(1001, product, 2);
		Order order = new Order(1001, new Date(2021,10,21));
		order.addItem(item);
		double	expectedCost = 190;
		
		assertEquals(expectedCost, order.checkOutCost());
	}
}
