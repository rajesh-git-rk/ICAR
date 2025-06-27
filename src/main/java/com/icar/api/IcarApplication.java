package com.icar.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@SpringBootApplication
@EnableCaching
@EnableAutoConfiguration

public class IcarApplication extends ServletInitializer {
	
	
	

	  public static void main(String[] args) {
		
		SpringApplication.run(IcarApplication.class, args);
		
		System.out.println("welcome---");
	}

}
