package com.lz.pika.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConfigController {

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String get() {
        return "hello world";
    }
}
