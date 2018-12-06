package com.upc.armifella.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.upc.armifella.entity.Driver;
import com.upc.armifella.service.UserService;

@RestController
@RequestMapping("driver-management/v1")
public class DriverController {

	@Autowired
	private UserService userService;

	@GetMapping("/driver")
	public List<Driver> getAllDriver() {
		return userService.getAllDriver();
	}

	@PostMapping("/driver")
	public Driver saveDriver(@RequestBody Driver driverRequest) {
		return userService.saveDriver(driverRequest);
	}

}
