package com.example.cicd_fie.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controller {

	@GetMapping("/get")
	public String hello()
	{
		return "hi Jeeva";
		
	}
	
	@GetMapping("/getAll")
	
	public String getAll()
	{
		return "the old concept is always powerfull";
	}

}
