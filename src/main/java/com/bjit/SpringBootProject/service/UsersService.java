package com.bjit.SpringBootProject.service;

import java.util.List;

import com.bjit.SpringBootProject.model.Users;

public interface UsersService {
	List<Users>usersList();
	Users findOne(Integer userId);
	Users addUsers(Users users);
	String deleteUsers(Integer userId);
}
