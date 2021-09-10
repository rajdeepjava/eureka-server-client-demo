package com.eureka.service3.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class Service3Controller {

	@Autowired
	private RestTemplate restTemplate;
	@RequestMapping("/test")
    public String hello() {
		String url="http://EUREKA-CLIENT-SERVICE/hello";
        return restTemplate.getForObject(url,String.class);
    }  
	
}
