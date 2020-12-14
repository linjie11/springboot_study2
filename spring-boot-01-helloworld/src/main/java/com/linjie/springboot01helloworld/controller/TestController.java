package com.linjie.springboot01helloworld.controller;

import com.linjie.springboot01helloworld.entity.FlightInfo;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Test")
public class TestController {
    @PostMapping(value="/Test",produces = "application/json;charset=UTF-8")
    public String Test(@RequestBody FlightInfo commandInfo){

        System.out.println(commandInfo);
        return "hello world";
    }
}
