package com.training.oracle.bms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
public class MessagingApiAppApplication {
	
	public String printGreetings () {
		return "Hi Oracle";
	}
	
	@GetMapping("name")
	public  String printName() {
		return "Hi Oracleeeee";
	}

	public static void  main(String[] args) {
		SpringApplication.run(MessagingApiAppApplication.class, args);
		System.out.println("Chandana");
		
		
	}

}
