package com.pluralshight.conferencedemo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/heartbeat")
public class EmptyController {

    @GetMapping
    public String get(){
        return "i-am-heartbeat";
    }
}
