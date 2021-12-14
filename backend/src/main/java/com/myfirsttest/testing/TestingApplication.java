package com.myfirsttest.testing;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TestingApplication {

	public static void main(String[] args) {
		try{
		SpringApplication.run(TestingApplication.class, args);
	} catch (Exception e) {
		e.printStackTrace();
	}
	}

}
