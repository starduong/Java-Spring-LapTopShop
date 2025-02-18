package com.example.laptopshop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//@SpringBootApplication
@SpringBootApplication(exclude = org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration.class)

public class LapTopShopApplication {

	public static void main(String[] args) {
		SpringApplication.run(LapTopShopApplication.class, args);
	}

}
