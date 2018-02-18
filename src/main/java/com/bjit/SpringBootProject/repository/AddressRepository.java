package com.bjit.SpringBootProject.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bjit.SpringBootProject.model.Address;

public interface AddressRepository  extends JpaRepository<Address, Integer>{

}
