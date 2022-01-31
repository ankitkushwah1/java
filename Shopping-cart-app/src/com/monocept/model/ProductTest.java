package com.monocept.model;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
public class ProductTest {
	
	@Test
	public void constructorTest() {
		Product product = new Product(1001, "Cup", 100, 5.0f);
		
		int exepectedId=1001;
		String exepectedName ="Cup";
		double exepectedPrice = 100;
		float excpectedDiscount = 5.0f;
		
		assertEquals(exepectedId, product.getId());
		assertEquals( exepectedName, product.getName());
		assertEquals(exepectedPrice, product.getPrice());
		assertEquals(excpectedDiscount, product.getDiscount());
	}
	
	@Test
	public void CostafterDiscount() {
		Product product = new Product(1001, "Cup", 100, 5.0f);
		double exepectedCost =95.0f;
		assertEquals(exepectedCost, product.costAfterDiscount());
	}
}
