package com.krishnavyas.appref.refring.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.krishnavyas.appref.refring.Authentication.User;
import com.krishnavyas.appref.refring.repositories.UserRepository;

@Component
@RestController
public class UserController {

	@Autowired
	private UserRepository userRepository;
	
	
	public UserController() {
		// TODO Auto-generated constructor stub
	}

	
	@PostMapping("/adduser")
	public String savingUser(@RequestBody User user)
	{
		userRepository.save(user)	;
		return "saved sucessfully";
	}
	
	@GetMapping("/getUsers")
	public ResponseEntity<List<User>> allUsers()
	{
		List<User> users=userRepository.findAll();
		return ResponseEntity.ok(users);
	}

	@GetMapping("/hello")
	public String helloUser()
	{
			return "hello";
	}
	
}
