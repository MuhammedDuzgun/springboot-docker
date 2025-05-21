package com.demo.springbootdocker.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/test")
    public ResponseEntity<String> test() {
        return ResponseEntity.ok("Hello World");
    }

    @GetMapping("/test2")
    public ResponseEntity<String> testGithubActionsDeploy() {
        return ResponseEntity.ok("Hello World - Github Actions Deploy");
    }

    @GetMapping("/test3")
    public ResponseEntity<String> testGithubActionsDeploy2() {
        return ResponseEntity.ok("Hello World - Github Actions Deploy 2");
    }

}
