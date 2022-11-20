package com.example.demo.service;

import java.util.LinkedList;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.demo.model.Product;
import com.example.demo.repository.ProductRepo;
@Service
public class ProductService implements ProductServiceImp{
	@Autowired
	ProductRepo productRepo;

	@Override
	public List<Product> allProducts() {
		// TODO Auto-generated method stub
		return productRepo.findAll();
	}
	@Override
	public Optional<Product> findOneProducts(@PathVariable("id") Integer id) {
		// TODO Auto-generated method stub
		return productRepo.findById(id);
	}
	@Override
	public void insertProduct(Product product) {
		// TODO Auto-generated method stub
		
	}

}
