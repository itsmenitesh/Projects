package com.DemoKeycloak_rest_api.keycloak;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/demo")
public class DemoController {
    @GetMapping
    public String hello(){
        return "hello from sprinboot";
    }

    @GetMapping("/hell-2")
    public String hello2(){
        return "hello from sprinboot - ADMIN";
    }
}
