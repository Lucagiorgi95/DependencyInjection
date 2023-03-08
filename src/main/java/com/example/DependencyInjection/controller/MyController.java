package com.example.DependencyInjection.controller;

import com.example.DependencyInjection.service.MyService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    private MyService service;

    public MyController(MyService service) {
        System.out.println("The constructor has been called");
        this.service = service;
    }

    @GetMapping
    public String helloMsg(){
        return "Hello";
    }

    @GetMapping("/getName")
    public String getName(){
        return service.getName();
    }

}