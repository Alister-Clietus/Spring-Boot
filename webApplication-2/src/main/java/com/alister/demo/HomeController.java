package com.alister.demo;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @PostMapping("/add")
    public ResponseEntity<Integer> addNumbers(@RequestBody NumbersRequest numbers) {
        int result = numbers.getNumber1() + numbers.getNumber2();
        return new ResponseEntity<>(result, HttpStatus.OK);
    }
}

