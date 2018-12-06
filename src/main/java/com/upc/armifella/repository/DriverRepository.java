package com.upc.armifella.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.upc.armifella.entity.Driver;

@Repository
public interface DriverRepository extends JpaRepository<Driver, Long> {

}
