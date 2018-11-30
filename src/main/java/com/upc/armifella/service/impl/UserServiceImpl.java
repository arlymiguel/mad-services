package com.upc.armifella.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.upc.armifella.entity.User;
import com.upc.armifella.repository.UserRepository;
import com.upc.armifella.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;
	
	
	@Override
	public List<User> getAllUser() {
		return (List<User>) userRepository.findAll();
	}

}
