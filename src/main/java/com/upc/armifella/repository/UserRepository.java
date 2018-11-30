package com.upc.armifella.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.upc.armifella.entity.User;

@Repository
public interface UserRepository extends CrudRepository<User, Integer> {

	
}
