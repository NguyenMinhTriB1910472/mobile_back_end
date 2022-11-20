package com.example.demo.service;

import java.util.LinkedList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.demo.model.Cart;
import com.example.demo.model.Product;
import com.example.demo.repository.*;

@Service
public class CartService implements CartServiceImp{
	@Autowired
	CartRepository cartRepo;
	ProductService productService;
	
	@Override
	public void viewAllService() {
		// TODO Auto-generated method stub
	}
	
	@Override
	public List<Cart> getAllCart() {
		return cartRepo.findAll();
	}

	@Override
	public void insertToOrders(@RequestBody List<Product> productsList) {
		// TODO Auto-generated method stub
		List<Optional<Product>> productOptionals=new LinkedList<>();
		for (int i = 0; i < productsList.size(); i++) {
			Optional<Product> product=productService.findOneProducts(productsList.get(i).getId());
			productOptionals.add(product);
		}
		for (int i = 0; i < productOptionals.size(); i++) {
			
		}
	}

}
