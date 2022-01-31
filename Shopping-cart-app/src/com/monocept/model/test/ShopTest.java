package com.monocept.model.test;

import java.sql.Date;
import java.util.List;

import java.util.*;

import com.monocept.model.Customer;
import com.monocept.model.LineItem;
import com.monocept.model.Order;
import com.monocept.model.Product;

public class ShopTest {
	public static void main(String [] args) {
		
		Product laptop = new Product(1001,"Laptop" , 90000, 5);
		LineItem items = new  LineItem(1002,laptop,2);
		Order order = new Order(1003, new Date(2021,10,22));
		order.addItem(items);
		Customer customer1 = new Customer(1001, "Faisal");
		customer1.addOrder(order);
		
		
		Product mobile = new Product(1004,"mobile" , 10000, 12);
		items = new  LineItem(1005,mobile,5);
		order = new Order(1006, new Date(2021,10,23));
		order.addItem(items);
		customer1.addOrder(order);
		printDetails(customer1);
	}
	public static void  printDetails(Customer c) {
		System.out.println("Customer name : " +c.getName());
		System.out.println("Customer Id : "+c.getId());
		System.out.println("Number of order : "+c.orderCount());
		List <Order> orders = c.getOrders();
		printOrders(orders);
		System.out.println("Total cost : "+c.calculateTotalCost());
	}
	
	public static void printOrders(List<Order> orders) {
		for(Order order :orders) {
			System.out.println("Order Id : "+order.getId());
			System.out.println("Order Date : "+order.getDate());
			System.out.println("Number of Items :"+order.itemCount());
			System.out.println("Check out Cost of order : "+ order.checkOutCost());
			List<LineItem> items = order.getOrderItems();
			printItems(items);
			System.out.println("Order checkOutCost : "+order.checkOutCost());
		}
	}
	
	public static void printItems(List<LineItem> items) {
		for(LineItem item :items) {
			System.out.println("Item id :"+item.getId());
			System.out.println("Quantity : "+item.getQuantity());
			Product product = item.getProduct();
			printProduct(product);
			System.out.println("items cost : "+item.calculateLineItemCost());
		}
		
	}
	
	public static void printProduct(Product product) {
		System.out.println("Product Id : "+product.getId());
		System.out.println("Product Name : "+product.getName());
		System.out.println("Product price : "+product.getPrice());
		System.out.println("Product percentage discount : "+product.getDiscount());
		System.out.println("Product cost after discount : "+product.costAfterDiscount());
		System.out.println();
	}
}
