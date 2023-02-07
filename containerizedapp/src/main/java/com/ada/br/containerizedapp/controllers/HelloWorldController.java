package com.ada.br.containerizedapp.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloWorldController {

    @GetMapping
    public static ResponseEntity<String> helloWorld() {
        return ResponseEntity.ok("Hello world to you!");
    }

}
