package com.ecommerce.API.EcommerceAPI.controller;

import com.ecommerce.API.EcommerceAPI.modules.Address;
import com.ecommerce.API.EcommerceAPI.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AddressController {
    @Autowired
    AddressService addressService;

    //addAddress
    @PostMapping("/addAddress")
    public String addAddress(@RequestBody Address address){
        return addressService.addAddressData(address);
    }
}
