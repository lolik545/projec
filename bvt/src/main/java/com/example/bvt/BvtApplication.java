package com.example.bvt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
//
//@Configuration
//@ComponentScan(basePackages = {"com"})
//@EnableAutoConfiguration

@SpringBootApplication
public class BvtApplication {

	public static void main(String[] args) {
		SpringApplication.run(BvtApplication.class, args);
	}

}
