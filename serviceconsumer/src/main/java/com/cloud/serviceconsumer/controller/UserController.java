package com.cloud.serviceconsumer.controller;

import com.cloud.serviceconsumer.Consumer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {
    @Autowired
    private Consumer consumer;

    @RequestMapping("/info")
    public String info() {
        return " Hi,I am a consumer!";
    }
}


