package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Cart;
import com.example.demo.model.Product;

public interface CartServiceImp {
	public void viewAllService();
	List<Cart> getAllCart();
	void insertToOrders(List<Product> productsList);
}
