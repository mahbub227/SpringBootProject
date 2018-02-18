package com.bjit.SpringBootProject.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.bjit.SpringBootProject.model.Address;
import com.bjit.SpringBootProject.model.Users;
import com.bjit.SpringBootProject.repository.AddressRepository;
import com.bjit.SpringBootProject.service.AddressService;

public class AddressServiceImpl implements AddressService {
	
	@Autowired
	private AddressRepository addressRepository;

	@Override
	public List<Address> addressList() {
		// TODO Auto-generated method stub
		return addressRepository.findAll();
	}

}
