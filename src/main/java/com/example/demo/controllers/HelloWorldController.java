package com.example.demo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class HelloWorldController {


    @GetMapping("/hello-world")
//    @RequestMapping(method = RequestMethod.GET,value = "/hello-world")
    public String sayHelloWorld() {
        return "Hello World";
    }

    @GetMapping("/say-cheese")
    public String sayCheese() {
        return "Hello Cheese";
    }


}
