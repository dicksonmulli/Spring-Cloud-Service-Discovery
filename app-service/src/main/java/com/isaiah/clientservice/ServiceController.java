package com.isaiah.clientservice;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class ServiceController {

    @Value("${service.instance.name}")
    //@Value("name")
    private String instance;

    @GetMapping
    public String message() {
        return "Hello from " + instance;
    }
}
