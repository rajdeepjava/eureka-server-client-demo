package com.eureka.service3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class EurekaService3Application {

	public static void main(String[] args) {
		SpringApplication.run(EurekaService3Application.class, args);
	}

}

@Configuration
class ConfigRest
{
@LoadBalanced
@Bean
 public RestTemplate restTemplate() {
	
	return new RestTemplate();
}

}