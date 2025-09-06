package com.mecook.backend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Application {

    @GetMapping("/")
    public ResponseEntity<String> home() {
        return ResponseEntity.ok("Main Application");
    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
