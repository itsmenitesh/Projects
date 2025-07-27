package com.employeeAddress.EmployeeAddress.repository;

import com.employeeAddress.EmployeeAddress.modules.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IEmployeeRepository extends JpaRepository<Employee , Long> {
}
