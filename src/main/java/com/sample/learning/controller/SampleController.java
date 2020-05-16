package com.sample.learning.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.sample.learning.exception.UserNotFoundException;
import com.sample.learning.service.SampleService;
import com.sample.learning.user.A;
import com.sample.learning.user.OracleProperty;
import com.sample.learning.user.User;

@RestController
public class SampleController {
	
	@Autowired
	SampleService sample1;
	
	@Autowired
	SampleService sample2;
	
	@Autowired
	User user;
	
	@Autowired
	@Qualifier("oracle")
	OracleProperty oracle;
	

	@GetMapping("/sample")
	public @ResponseBody List<String> getSample(){
		System.out.println("1111111111112222222");
		
		List<String> list = new ArrayList<String>();
		list.add("Test");
		return list;
	}
	
}
