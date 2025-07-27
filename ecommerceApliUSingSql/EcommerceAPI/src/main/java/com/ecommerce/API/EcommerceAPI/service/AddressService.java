package com.ecommerce.API.EcommerceAPI.service;

import com.ecommerce.API.EcommerceAPI.modules.Address;
import com.ecommerce.API.EcommerceAPI.modules.Users;
import com.ecommerce.API.EcommerceAPI.repository.IAddressRepository;
import com.ecommerce.API.EcommerceAPI.repository.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AddressService {
    @Autowired
    IAddressRepository iAddressRepository;
    @Autowired
    IUserRepository iUserRepository;

    public String addAddressData(Address address) {
        Users user = address.getUsers();

        Optional<Users> list = iUserRepository.findById(user.getUserId());

        if(list.isEmpty())  return "not found";
        address.setUsers(list.get());
        iAddressRepository.save(address);
        return "updated!!";
    }
}
