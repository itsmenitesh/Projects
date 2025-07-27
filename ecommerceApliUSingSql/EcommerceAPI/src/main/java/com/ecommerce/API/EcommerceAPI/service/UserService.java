package com.ecommerce.API.EcommerceAPI.service;

import com.ecommerce.API.EcommerceAPI.modules.Users;
import com.ecommerce.API.EcommerceAPI.repository.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    @Autowired
    IUserRepository iUserRepository;


//addUser
    public String addUserData(List<Users> usersList) {

        List<Users> usersLists = iUserRepository.saveAll(usersList);
        if(usersLists == null){
            return "user data not added";
        }else {
            return "user Added !!!";
        }
    }

    //getUSerById
    public String getUserId(Integer id) {
        Optional<Users> usersOptional = iUserRepository.findById(id);
        if(usersOptional.isEmpty()) return iUserRepository.findAll().toString();
        else{
            List<Users> usersList = new ArrayList<>();
            Optional<Users> usersList1 = iUserRepository.findById(id);
            if(usersList1.isEmpty())   return "Id related data not found";
            usersList.add(iUserRepository.findById(id).get());
            return usersList.toString();

        }
    }
}
