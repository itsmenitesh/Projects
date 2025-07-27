package com.second.secondtry.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class trymyfile {
    @GetMapping(value= "/try")
    public String GetTry(){
        String name= "My name is Nitesh Choudhary";
        return name;
    }
    @PutMapping(value="/try")
    public String PutTry(){
        String name =" My name is Roshan Choudhary";
        return name;
    }
    @DeleteMapping(value="/try")
    public String DeleteTry(){
        String name ="I nitesh  i am deleting my name from here";
        return name;
    }
    @PostMapping(value = "/cat")
    public String saveCat(@RequestBody String requestData) {
        System.out.println(requestData);
        return "Saved- " + requestData;
    }

}
