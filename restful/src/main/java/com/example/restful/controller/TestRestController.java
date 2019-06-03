package com.example.restful.controller;


import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/rest") // link to go to api
public class TestRestController {
    @RequestMapping("/hello/{name}")
    @ResponseBody
    public String sayHello(@PathVariable("name") String name){
        return "Hello " + name;
    }
}
