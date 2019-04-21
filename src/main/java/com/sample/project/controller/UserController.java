package com.sample.project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sample.project.model.User;
import com.sample.project.repository.UserRepository;

@RestController
public class UserController {

	@Autowired
	private UserRepository userRepository;
	
	@GetMapping("/all")
	public List<User> getAllUser() {
		return userRepository.findAll();
	}
	
	@PostMapping("/")
	public void createUser(@RequestBody User input) {
		userRepository.save(input);
	}
	
}
