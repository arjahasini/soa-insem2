package com.example.demo.controller;

import com.example.demo.service.ArithmeticService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/math")
public class MS1Controller {

    private final ArithmeticService service;

    public MS1Controller(ArithmeticService service) {
        this.service = service;
    }

    @GetMapping("/add")
    public String add(@RequestParam int a, @RequestParam int b) {
        return a + " + " + b + " = " + service.add(a, b);
    }
}
