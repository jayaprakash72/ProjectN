package com.pfms.Personal_Finance_Management.controller;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pfms.Personal_Finance_Management.model.User;
import com.pfms.Personal_Finance_Management.repository.UserRepository;

@RestController
@RequestMapping("/secure/auth")
public class UserController {

	@Autowired
	private BCryptPasswordEncoder passwordEncoder;
	
	@Autowired
	private UserRepository userRepository;
	@PostMapping("/user/add")
	public String addUser(@RequestBody User user) {

	 
		String pwd=user.getPassword();
		String encryptPwd=passwordEncoder.encode(pwd);
		user.setPassword(encryptPwd);
		userRepository.save(user);
		return "User added successfully";
	}
	
	
	

	

	
}
