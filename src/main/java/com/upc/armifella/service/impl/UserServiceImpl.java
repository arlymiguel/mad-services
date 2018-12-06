package com.upc.armifella.service.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.upc.armifella.entity.Driver;
import com.upc.armifella.entity.User;
import com.upc.armifella.entity.Vehicle;
import com.upc.armifella.repository.DriverRepository;
import com.upc.armifella.repository.UserRepository;
import com.upc.armifella.repository.VehicleRepository;
import com.upc.armifella.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	private static final Logger LOGGER = LoggerFactory.getLogger(UserServiceImpl.class);

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private DriverRepository driverRepository;

	@Autowired
	private VehicleRepository vehicleRepository;

	@Override
	public List<Driver> getAllDriver() {
		return driverRepository.findAll();
	}

	@Override
	public boolean login(User userRequest) {
		LOGGER.info("##login : " + userRequest.getUsername() + ", " + userRequest.getPassword());
		User result = userRepository.login(userRequest.getUsername(), userRequest.getPassword());
		return null == result ? false : true;
	}

	@Override
	public Driver saveDriver(Driver driver) {
		LOGGER.info("##saveDriver : " + driver.getName() + ", " + driver.getLastname());
		return driverRepository.save(driver);
	}

	@Override
	public List<Vehicle> getAllVehicle() {
		return vehicleRepository.findAll();
	}

	@Override
	public Vehicle saveVehicle(Vehicle vehicle) {
		return vehicleRepository.save(vehicle);
	}

}
