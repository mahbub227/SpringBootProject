package com.bjit.SpringBootProject.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bjit.SpringBootProject.model.Users;

public interface UsersRepository extends JpaRepository<Users, Integer>{

}
