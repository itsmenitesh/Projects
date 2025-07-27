package com.employeeAddress.EmployeeAddress.controller;

import com.employeeAddress.EmployeeAddress.modules.Address;
import com.employeeAddress.EmployeeAddress.services.AddressService;
import com.employeeAddress.EmployeeAddress.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AddressController {
 @Autowired
    AddressService addressService;

 //getAllAddress
    @GetMapping(value = "allAddress")
    public String getAllAddress(){
        return addressService.getAllAddresses();
    }

 //addAddress
    @PostMapping(value = "/addAddress")
    public String addAddress(@RequestBody List<Address> addressList){
        return addressService.addAddressData(addressList);
    }

    //getAddressById
    @GetMapping(value = "/getAddressId")
    public String getAddressById(@RequestParam Long addressId){
        return addressService.getAddressId(addressId);
    }

    //UpdateAddressUsingId


    @PutMapping(value = "/updateAddress/{addressId}")

    public String UpdateAddressUsingId(@PathVariable Long addressId , @RequestBody Address address){
        return addressService.UpdateAddressByUsingId(addressId ,address);
    }

    //deleteEmployeeById

    @DeleteMapping(value = "deleteAddress/{addressId}")
    public void deleteAddress(@PathVariable Long addressId){
        addressService.deleteAddressId(addressId);
    }


}
