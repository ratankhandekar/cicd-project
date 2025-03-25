package com.example.cicd;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controller {

    //ratan changesss into branch
    @GetMapping("/home")
    public String home()
    {
        return "Hello World::  ";
    }
}
