package com.bjit.SpringBootProject.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bjit.SpringBootProject.model.Users;
import com.bjit.SpringBootProject.service.UsersService;

@RestController
@RequestMapping("/users")
public class UsersController {
	
	@Autowired
	private UsersService usersService;
	
	
	
	@RequestMapping(value="/list")
	public List<Users>usersList(){
		return usersService.usersList();
	}
	
	@RequestMapping(value="/list/{userId}")
	public Users findOne(@PathVariable Integer userId){
		return usersService.findOne(userId);
	}
	
	@PostMapping(value="/add")
	public Users addUser(@Valid @RequestBody Users users) {
		return usersService.addUsers(users);
	}
	
	
	@RequestMapping(value="/delete/{userId}")
	public String deleteUser(@PathVariable Integer userId){
		return usersService.deleteUsers(userId);
	}
	
	
	
	
}
