package com.charan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class App {

    @GetMapping("/")
    public String home() {
        return "HEllo world , POC 1 CICD pipeline ";
    }

    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }
}
