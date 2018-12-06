package com.upc.armifella.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.upc.armifella.entity.User;
import com.upc.armifella.service.UserService;

@RestController
@RequestMapping("user-management/v1")
public class LoginController {

	@Autowired
	private UserService userService;

	@PostMapping("/authenticate")
	public boolean login(@RequestBody User userRequest) {
		return userService.login(userRequest);
	}
	
}
