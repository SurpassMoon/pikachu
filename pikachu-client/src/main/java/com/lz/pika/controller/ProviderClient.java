package com.lz.pika.controller;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient("pikachu-test")
public interface ProviderClient {

    @RequestMapping(value = "/123", method = RequestMethod.GET)
    String helloWord();

}
