package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Cart;
import com.example.demo.service.CartService;

@RestController
@RequestMapping("/cart")
public class CartController {
	@Autowired
	CartService cartService;
	
	@GetMapping("/all")
	public ResponseEntity<?> getAllTheLoais(){
		List<Cart> carts =cartService.getAllCart();
		return new ResponseEntity<List<Cart>>(carts,HttpStatus.OK); 
	}
	@GetMapping("/all1")
	public ResponseEntity<String> getAllTheLoai(){
		List<Cart> carts =cartService.getAllCart();
		return new ResponseEntity<String>("123",HttpStatus.OK); 
	}
}
