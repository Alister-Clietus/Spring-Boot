package com.alister.savetwonumbers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/print")
public class PrintController {

    @GetMapping
    public String printHello() {
        String message = "Hello, World!";
        System.out.println(message); // Print to the console
        return message;
    }
}

