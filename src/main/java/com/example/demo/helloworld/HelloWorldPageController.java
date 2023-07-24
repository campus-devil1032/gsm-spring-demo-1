package com.example.demo.helloworld;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloWorldPageController {


    @GetMapping("/")
    public String getIndexPage(Model model) {
        return "index";
    }
}
