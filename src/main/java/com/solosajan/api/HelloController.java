package com.solosajan.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/health")
    public String health() {
        return "API is running fine";
    }

    @GetMapping("/hello")
    public String hello() {
        return "Hello from GKE Spring Boot API - NEW VERSION deployed at " + java.time.LocalDateTime.now();
    }
}

