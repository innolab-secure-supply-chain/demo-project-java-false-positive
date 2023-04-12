package com.example.demo;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {


    @GetMapping(path = "/api/test")
    public ResponseEntity<String> getTest() {
        return ResponseEntity.ok("Test successful");
    }
}
