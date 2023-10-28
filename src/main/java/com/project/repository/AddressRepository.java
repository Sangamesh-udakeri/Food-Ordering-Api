package com.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.model.Address;
import com.project.model.Hotel;

@Repository
public interface AddressRepository extends JpaRepository<Address, Integer> {

	
}
