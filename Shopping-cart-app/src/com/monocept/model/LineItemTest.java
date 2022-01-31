package com.monocept.model;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
public class LineItemTest {

	@Test
	public void ConstructorTest() {
		Product product = new Product(1001, "Cup", 100, 5.0f);
		LineItem item = new LineItem(1001, product, 2);
		int exepectedId = 1001;
		Product excpetedProduct = product;
		int exepectedQuantity = 2;
		
		assertEquals(exepectedId, item.getId());
		assertEquals(excpetedProduct, item.getProduct());
		assertEquals(exepectedQuantity, item.getQuantity());
	}
	
	@Test 
	public void calculateLineItemCost() {
		Product product = new Product(1001, "Cup", 100, 5.0f);
		LineItem item = new LineItem(1001, product, 2);
		double expectedCost = 190;
		assertEquals(expectedCost, item.calculateLineItemCost());
	}
}
