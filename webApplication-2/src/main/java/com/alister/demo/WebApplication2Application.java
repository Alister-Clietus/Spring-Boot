package com.alister.demo;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class WebApplication2Application
{

	public static void main(String[] args) 
	{
		SpringApplication.run(WebApplication2Application.class, args);
	}
    @PostMapping("/hello")
    public String hello(@RequestParam(value = "name", defaultValue = "World") String name) 
    {
      return String.format("Hello %s!", name);
    }
    @PostMapping("/trial")
    public String trial(@RequestParam(value = "name", defaultValue = "World") String name) 
    {
      return String.format("Hii This is a trial %s!", name);
    }

}
