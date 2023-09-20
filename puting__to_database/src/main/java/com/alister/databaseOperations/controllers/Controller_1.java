package com.alister.databaseOperations.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class Controller_1 
{
	@PostMapping("/print")
	public String main()
	{
		String rsponse="/put/numbers ruuned sussecefully";
		System.out.println(rsponse);
		return rsponse;
	}
	
	
	
	
	
	@GetMapping("/ptyu")
	public String mainn()
	{
		String sr1="ghgj";
		return sr1;
	}
	
	
	
}



