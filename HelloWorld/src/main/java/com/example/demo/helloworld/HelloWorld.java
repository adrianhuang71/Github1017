package com.example.demo.helloworld;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {
			
	@RequestMapping("/")
	public String hello() {
		return "HelloWorld";
	}
}
