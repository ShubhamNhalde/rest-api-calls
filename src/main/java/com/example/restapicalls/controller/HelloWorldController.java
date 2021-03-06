package com.example.restapicalls.controller;

import com.example.restapicalls.entity.User;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hello")
public class HelloWorldController {
    //UC1
    @RequestMapping(value = {"", "/"}, method = RequestMethod.GET)
    public String sayHello() {
        return "Hello from Bridgelabz";
    }

    //UC2
    @RequestMapping(value = {"/query"}, method = RequestMethod.GET)
    public String sayHello(@RequestParam(value = "name") String name) {
        return "Hello" + " " + name + " " + "From Bridgelabz";
    }

    //UC3
    @GetMapping(value = {"/param/{name}"})
    public String sayhelloParam(@PathVariable String name) {
        return "Hello" + " " + name + " " + "From Bridgelabz";
    }

    //UC4
    @PostMapping("/post")
    public String sayHelloPost(@RequestBody User user) {
        return "Hello" + user.getFirstname() + " " + user.getLastname();
    }

    //UC5
    @PutMapping("/put/{firstname}")
    public String sayhello(@PathVariable String firstname,
                           @RequestParam(value = "lastName") String lastName) {
        return "Hello " + firstname + lastName + "!";


    }


}
