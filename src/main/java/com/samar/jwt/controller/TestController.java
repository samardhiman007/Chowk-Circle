package com.samar.jwt.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/welcome")
public class TestController {


    @GetMapping
    public ResponseEntity<String> welcome() {
        return ResponseEntity.ok("Welcome! You are authenticated.");
    }

}
