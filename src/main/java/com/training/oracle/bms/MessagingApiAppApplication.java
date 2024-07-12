package com.training.oracle.bms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MessagingApiAppApplication {
	
	public String printGreetings () {
		return "Hi Oracle";
	}

	public static void  main(String[] args) {
		SpringApplication.run(MessagingApiAppApplication.class, args);
		System.out.println("Chandana");
		
		
	}

}
