package com.king.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.king.model.User;
import com.king.service.UserService;

@RestController
public class KingController {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping("/hello")
	public String hello() {
		return "Hello, King";
	}
	
	@RequestMapping("/find/{id}")
	public User find(@PathVariable int id, HttpServletRequest request) {
		User user = userService.findById(id);
		user.setUrl(request.getRequestURL().toString());
		
		return user;
	}
}
