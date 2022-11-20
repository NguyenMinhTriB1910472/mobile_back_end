package com.example.demo.service;

import com.example.demo.model.User;

public interface UserServiceImp {
	User LogIn(String email,String password);
	void signUp( String user_name, String email, String password, String phone, String address,int id_cart,int id_user);
}
