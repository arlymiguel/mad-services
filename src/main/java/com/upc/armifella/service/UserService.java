package com.upc.armifella.service;

import java.util.List;

import com.upc.armifella.entity.Driver;
import com.upc.armifella.entity.User;
import com.upc.armifella.entity.Vehicle;

public interface UserService {

	public boolean login(User loginRequest);
	
	public List<Driver> getAllDriver();
	public Driver saveDriver(Driver driver);
	
	public List<Vehicle> getAllVehicle();
	public Vehicle saveVehicle(Vehicle vehicle);
	
}
