package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EchoController {
    @GetMapping("/echo1")
    public String echo1() {
        return "echo1";
    }

    @GetMapping("/echo2")
    public String echo2() {
        return "echo2";
    }
}
