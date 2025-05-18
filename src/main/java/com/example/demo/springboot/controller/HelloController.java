package com.example.demo.springboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @RequestMapping("/hello")
    public String greeting(@RequestParam(defaultValue = "Phong") String name,
                           @RequestParam(defaultValue = "") String address) {
//        return "Hello " + name + "- " + address;
        return String.format("Hello + %s - %s", name, address);
    }
}
