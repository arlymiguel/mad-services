package com.upc.armifella.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.upc.armifella.entity.Vehicle;
import com.upc.armifella.service.UserService;

@RestController
@RequestMapping("vehicle-management/v1")
public class VehicleController {

	@Autowired
	private UserService userService;


	@GetMapping("/vehicle")
	public List<Vehicle> getAllVehicle() {
		return userService.getAllVehicle();
	}

	@PostMapping("/vehicle")
	public Vehicle saveVehicle(@RequestBody Vehicle vehicleRequest) {
		return userService.saveVehicle(vehicleRequest);
	}
	
}
