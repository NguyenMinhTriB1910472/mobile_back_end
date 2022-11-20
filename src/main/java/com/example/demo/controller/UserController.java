package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.User;
import com.example.demo.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {
	@Autowired
	UserService userService;
	@PostMapping("/login")
	@ResponseBody
	public ResponseEntity<?> LogIn(@RequestParam String email,@RequestParam String password){
		User user=userService.LogIn(email,password);
		return new ResponseEntity<User>(user,HttpStatus.OK); 
	}
	@PostMapping("/signup")
	@ResponseBody
	public ResponseEntity<?> SignUp(
			@RequestParam("user_name") String user_name,
			@RequestParam("email") String email,
			@RequestParam("password") String password,
			@RequestParam("phone") String phone,
			@RequestParam("address") String address,
			@RequestParam("id_cart") int id_cart,
			@RequestParam("id_user") int id_user
			){
		userService.signUp(user_name, email, password, phone, address,id_user, id_cart);
		return new ResponseEntity<String>(" ",HttpStatus.OK); 
	}
}
