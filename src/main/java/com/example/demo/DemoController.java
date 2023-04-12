package com.example.demo;

import com.google.common.io.Files;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {


    @GetMapping(path = "/api/test")
    public ResponseEntity<String> getTest() {
        // The following api call would be insecure
        // var tmpDir = Files.createTempDir();

        String extension = Files.getFileExtension("foo.txt");

        return ResponseEntity.ok("Test successful");
    }
}
