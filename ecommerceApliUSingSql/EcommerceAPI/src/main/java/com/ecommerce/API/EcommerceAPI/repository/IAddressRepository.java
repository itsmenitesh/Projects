package com.ecommerce.API.EcommerceAPI.repository;

import com.ecommerce.API.EcommerceAPI.modules.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IAddressRepository extends JpaRepository<Address ,Integer> {
}
