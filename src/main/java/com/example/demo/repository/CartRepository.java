package com.example.demo.repository;
import java.util.List;
import java.util.Map;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Cart;
@Repository
public interface CartRepository extends JpaRepository<Cart,Integer>{
	@Query(value = "select * from cart",nativeQuery = true)
	List<Map<String,?>> getAllCart();
	
}
