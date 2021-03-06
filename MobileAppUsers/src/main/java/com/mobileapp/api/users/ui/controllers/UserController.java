package com.mobileapp.api.users.ui.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {

	@Autowired
	Environment env;
	@GetMapping("/status/check")
	public String status() {
		
		return "it is working on port: "+env.getProperty("local.server.port");
	}
	
}
