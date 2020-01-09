package com.test.cloud.deployment.HerokuSample.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/ping")
public class PingController {

    @GetMapping
    public String getPingService(){
        return "Hello Abinaya -- Welcome!!";
    }
}
