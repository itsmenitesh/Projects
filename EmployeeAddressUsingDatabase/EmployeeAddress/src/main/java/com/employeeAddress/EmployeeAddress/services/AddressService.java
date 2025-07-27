package com.employeeAddress.EmployeeAddress.services;

import com.employeeAddress.EmployeeAddress.modules.Address;
import com.employeeAddress.EmployeeAddress.repository.IAddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class AddressService {
    @Autowired
    IAddressRepository iAddressRepository;

    //getAllAddress
    public String getAllAddresses() {
        return iAddressRepository.findAll().toString();
    }
    public String addAddressData(List<Address> addressList) {
        List<Address> addressLists = iAddressRepository.saveAll(addressList);
        if(addressLists == null){
            return "Address not added ";
        }else {
            return "Address added";
        }
    }

    //getAddressById
    public String getAddressId(Long addressId) {
        if(addressId == null) return iAddressRepository.findAll().toString();
        else{
            List<Address> addressList = new ArrayList<>();
            Optional<Address> addressList1 = iAddressRepository.findById(addressId);
            if(addressList1.isEmpty())   return "Id related data not found";
            addressList.add(iAddressRepository.findById(addressId).get());
            return addressList.toString();

        }
    }

    //UpdateAddressUsingId
    public String UpdateAddressByUsingId(Long addressId, Address address) {
        Optional<Address> addressIdList = iAddressRepository.findById(addressId);
        address.setAddressId(addressId);
        if(addressIdList.isEmpty())return "Address not found";
        else {
            iAddressRepository.save(address);
            return "Updated!!!";
        }

    }


    //deleteEmployeeById

    public void deleteAddressId(Long addressId) {
        iAddressRepository.deleteById(addressId);
    }


}
