package com.example.restapicalls.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloWorldController {
    //UC1
    @RequestMapping(value = {"", "/"}, method = RequestMethod.GET)
    public String sayHello() {
        return "Hello from Bridgelabz";
    }


}
