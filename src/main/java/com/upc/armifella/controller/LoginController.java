package com.upc.armifella.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.upc.armifella.entity.User;
import com.upc.armifella.service.UserService;

@RestController
@RequestMapping("user-management/v1")
public class LoginController {

	@Autowired
	private UserService userService;
	
	@GetMapping("/authenticate")
	public boolean login() {
		return true;
	}
	
	
	@GetMapping("/user")
	public List<User> getUsers() {
		return userService.getAllUser();
	}
	
	
}
