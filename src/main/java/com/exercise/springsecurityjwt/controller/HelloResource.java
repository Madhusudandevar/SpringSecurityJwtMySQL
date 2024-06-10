package com.exercise.springsecurityjwt.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


/*
* This is basic testing controller for a start test.
* Not related to this application.
* Just test it, if you would want to make sure your
* local host is loading correctly on the web-client
* like Web Browser or PostMan etc.,
* */

@RestController
public class HelloResource {
    @GetMapping("/hello")
    public String hello(){
        return "Hello World!";
    }
}
