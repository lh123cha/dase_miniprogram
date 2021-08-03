package com.example.demo.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @RequestMapping(value = "/hello")
    public String testHello(){
        return "Hello";
    }

    @RequestMapping(value = "/test")
    public String testParam(@RequestParam("name") String name,
                            @RequestParam("passwd") String passwd,
                            @RequestParam(value = "address",required = false)String address){
        return name+":"+passwd+":"+address;

    }
}
