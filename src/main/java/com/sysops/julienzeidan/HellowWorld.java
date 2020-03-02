package com.sysops.julienzeidan;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HellowWorld {

    @GetMapping("/")
    public String HelloWorld() {
        return "Hello World";
    }

    public String helloWorld() {
        return null;
    }
}