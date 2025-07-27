package com.ecommerce.API.EcommerceAPI.controller;

import com.ecommerce.API.EcommerceAPI.modules.Users;
import com.ecommerce.API.EcommerceAPI.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    UserService userService;

    //addUser
    @PostMapping(value = "/addUser")
    public String addUser(@RequestBody List<Users> usersList) {
        return userService.addUserData(usersList);
    }

    //getUserById
    @GetMapping(value = "/getUserId")
    public String getUserId(@RequestParam Integer id){
        return userService.getUserId(id);
    }

}
