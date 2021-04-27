package com.example.api.modules.home;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping
    public String index() {

        return "hello world!";
    }

    @GetMapping
    public Integer show() {

        return "hello world!";
    }
}
