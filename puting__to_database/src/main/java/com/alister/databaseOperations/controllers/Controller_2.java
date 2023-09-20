package com.alister.databaseOperations.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alister.databaseOperations.DTO.NumbersDTO;
import com.alister.databaseOperations.service.AddnumbersImplementation;

@RestController
@RequestMapping("/put")
public class Controller_2 
{
	@Autowired
	AddnumbersImplementation imple;
	
	@PostMapping("/numbers")
	public int numbers(@RequestBody NumbersDTO numbersDTO)
	{
		
		int status=imple.addnumbers(numbersDTO);
		
		return status;
		
	}
	
}
