package com.memong.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.memong.dto.testDTO;
import com.memong.service.TestService;

@RestController
@RequestMapping(value="/")
public class TestController {
	@Autowired
	TestService testService;
	
	@RequestMapping(value="home", method = RequestMethod.POST)
	public String getHome() {
		testDTO test = new testDTO();
		
		test.setId("test");
		test.setPassword("1234");
		
		testService.insertTest(test);
		
		return "Hello World!";
	}
}
