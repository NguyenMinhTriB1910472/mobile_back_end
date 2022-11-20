package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import com.example.demo.model.Product;

interface ProductServiceImp {
	public List<Product> allProducts();

	Optional<Product> findOneProducts(Integer id);

	void insertProduct(Product product);
}
