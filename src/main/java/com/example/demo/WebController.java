package com.example.demo;

import org.springframework.stereotype.Controller;

@Controller
public class WebController {
    public String index() {
        return "index";
    }
}
