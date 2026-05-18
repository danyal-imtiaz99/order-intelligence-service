package com.example.orderintelligence.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class StatusController {

    @GetMapping("/api/status")
    public Map<String, String> getStatus(){
        return Map.of("status", "UP");
    }

    @GetMapping("/api/version")
    public Map<String, String> getVersion(){
        return Map.of("Version", "0.0.1-SNAPSHOT");
    }
}
