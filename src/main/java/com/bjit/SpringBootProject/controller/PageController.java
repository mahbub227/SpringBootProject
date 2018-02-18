package com.bjit.SpringBootProject.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PageController {
	
	@RequestMapping("/")
	public String page() {
		return "This is it!okreally!";
	}
}
