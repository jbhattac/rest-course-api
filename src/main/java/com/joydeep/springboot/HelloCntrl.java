package com.joydeep.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloCntrl {
	
	@Autowired
	Test1 test;
	
	@RequestMapping("/hello")
	public String sayHi(){
		return "Hi";
	}

}
