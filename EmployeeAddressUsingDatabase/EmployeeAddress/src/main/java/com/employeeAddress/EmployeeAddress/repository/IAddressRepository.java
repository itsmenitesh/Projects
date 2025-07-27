package com.employeeAddress.EmployeeAddress.repository;

import com.employeeAddress.EmployeeAddress.modules.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IAddressRepository extends JpaRepository<Address ,Long> {

}
