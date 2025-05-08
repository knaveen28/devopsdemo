package com.devops.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class devopsController {

    @GetMapping
	public String helloWorld() {
		return "Hello World";
	}

}
