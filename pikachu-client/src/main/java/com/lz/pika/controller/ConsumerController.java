package com.lz.pika.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConsumerController {

    @Autowired
    ProviderClient providerClient;

    @RequestMapping(value = "/hello-consumer", method = RequestMethod.GET)
    public String hello() {
        return providerClient.helloWord();
    }
}
