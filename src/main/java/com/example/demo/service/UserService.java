package com.example.demo.service;

import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.model.User;
import com.example.demo.repository.UserRepository;
@Service

public class UserService implements UserServiceImp{
	@Autowired
	UserRepository userRepository;
	@Transactional
	@Override
	public void signUp(
			
			@RequestParam("user_name") String user_name,
			@RequestParam("email") String email,
			@RequestParam("password") String password,
			@RequestParam("phone") String phone,
			@RequestParam("address") String address,
			@RequestParam("id_cart") int id_cart,
			@RequestParam("id_user") int id_user){
		//int id_cart1=Integer.parseInt(id_cart);
		//int id_user1=Integer.parseInt(id_user);
		userRepository.SignIn( user_name, email, password, phone, address, id_cart,id_user);
	
	}
	@Override
	public User LogIn(String email,String password) {
		// TODO Auto-generated method stub
		return userRepository.LogIn(email, password);
	}
	
}
