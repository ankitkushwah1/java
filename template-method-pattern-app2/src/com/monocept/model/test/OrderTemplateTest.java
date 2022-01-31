package com.monocept.model.test;

import com.monocept.model.OnlineOrder;
import com.monocept.model.OrderProcessTemplate;
import com.monocept.model.StoreOrder;

public class OrderTemplateTest {
	
	public static void main(String  [] args) {
		
		OrderProcessTemplate onlineOrder = new OnlineOrder();
		onlineOrder.processOrder(true);
		System.out.println();
		
		OrderProcessTemplate storeOrder = new StoreOrder();
		storeOrder.processOrder(true);
	}
}
