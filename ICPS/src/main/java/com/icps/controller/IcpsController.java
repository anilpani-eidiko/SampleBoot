package com.icps.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class IcpsController {
	
	@GetMapping(path="/allUser")
	public String getUsers()
	{
		return "test";
		
	}

}
