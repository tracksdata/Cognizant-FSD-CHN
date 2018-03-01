package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.service.MyService;

@RestController
@ComponentScan("com.example.service")
public class MyController {

	@Autowired
	private MyService myService;
	
	@RequestMapping("welcome")
	public String testMethod() {
		return myService.myServiceMethod();
	}
}
