package com.eureka.service1.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Service1Controller {

	@RequestMapping("/hello")
	    public String hello() {
	        return "Hello World RESTful with newSpring Boot";
	    }  
	}