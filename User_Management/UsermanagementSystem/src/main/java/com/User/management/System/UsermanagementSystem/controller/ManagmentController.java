package com.User.management.System.UsermanagementSystem.controller;

import com.User.management.System.UsermanagementSystem.service.ManagmentService;
import com.User.management.System.UsermanagementSystem.module.Managment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ManagmentController {
    @Autowired
    ManagmentService managmentService;
    //showing all present user
    @GetMapping(value="/getAllUser")  //getAllUser
    public List<Managment> getAllUser(){
        return managmentService.getAllUser();
    }

    //adding user
    @PostMapping(value = "/addUser")//addUser
    public String addUser(@RequestBody Managment managment){

        return managmentService.addUser(managment);
    }
    //its getting user by there specific id
    @GetMapping(value="/getUserId/{UserId}")
    public Managment getUserId(@PathVariable String UserId){
        return managmentService.getUserBasedOnId(UserId);
    }

    //its doing deleting work
    @DeleteMapping(value = "/deleteUserById/{id}")
    public String deleteUserById(@PathVariable String id){
        return managmentService.removeUserById(id);
    }

    //updating managmentUser
    @PutMapping(value = "/updateUserStatusById/{id}/{status}")
    public String updateUserStatusById(@PathVariable String id,@PathVariable boolean status){
        return managmentService.updateUserStatusById(id,status);
    }
}
