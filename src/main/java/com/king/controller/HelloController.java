package com.king.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	@RequestMapping(value="/normal", method=RequestMethod.GET)
	public String normalHello() {
		return "Hello, World";
	}
	
	@RequestMapping(value="/err", method=RequestMethod.GET)
	public String errorHello() throws InterruptedException {
		Thread.sleep(500);
		return "Hello, Error";
	}
}	
