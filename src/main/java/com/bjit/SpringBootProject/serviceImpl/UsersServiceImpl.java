package com.bjit.SpringBootProject.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bjit.SpringBootProject.model.Users;
import com.bjit.SpringBootProject.repository.UsersRepository;
import com.bjit.SpringBootProject.service.UsersService;

@Service
public class UsersServiceImpl implements UsersService {
	
	@Autowired
	private UsersRepository usersRepository;
	

	
	@Override
	public List<Users> usersList() {
		// TODO Auto-generated method stub
		return usersRepository.findAll();
	}



	@Override
	public Users findOne(Integer userId) {
		// TODO Auto-generated method stub
		return usersRepository.findOne(userId);
	}



	@Override
	public Users addUsers(Users users) {
		// TODO Auto-generated method stub
		return usersRepository.save(users);
	}



	@Override
	public String deleteUsers(Integer userId) {
		// TODO Auto-generated method stub
		usersRepository.delete(userId);
		return "User deleted!";
	}

}
