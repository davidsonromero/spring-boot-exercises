package com.course.spring.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstController {

    @GetMapping(path = {"/hello", "/"})
    public String hello() {
        return "Vai Corinthians!";
    }

    @PostMapping(path = {"/test"})
    public String test(String name) {
        return "Hello, %s!".formatted(name);
    }
}
