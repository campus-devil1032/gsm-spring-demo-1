package com.example.demo.helloworld;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @Autowired
    private HelloWorldService helloWorldService;

    @GetMapping("/hello-json")
    @ResponseBody
    public ResponseEntity<?> getPage() {
        // Response
        HelloWorldResponseKV resp = HelloWorldResponseKV.of("World");
        return new ResponseEntity<>(resp, HttpStatus.OK);
    }

}
