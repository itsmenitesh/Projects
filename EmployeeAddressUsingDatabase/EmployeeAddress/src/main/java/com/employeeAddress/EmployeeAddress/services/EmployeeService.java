package com.employeeAddress.EmployeeAddress.services;

import com.employeeAddress.EmployeeAddress.modules.Employee;
import com.employeeAddress.EmployeeAddress.repository.IEmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {
    @Autowired
    IEmployeeRepository iEmployeeRepository;

    //getAllEmployee
    public String getAllEmployees() {
        return iEmployeeRepository.findAll().toString();
    }


    //addEmployee
    public String addEmployeesData(List<Employee> employeeList) {


       List<Employee> employeeLists = iEmployeeRepository.saveAll(employeeList);
       if(employeeLists == null){
           return "Employee data not added";
       }else {
           return "Employee Added !!!";
       }
    }

    //getEmployeeById
    public String getEmployeeId(Long employeeId) {
        if(employeeId == null) return iEmployeeRepository.findAll().toString();
        else{
            List<Employee> employeeList = new ArrayList<>();
            Optional<Employee> employeeList1 = iEmployeeRepository.findById(employeeId);
            if(employeeList1.isEmpty())   return "Id related data not found";
                employeeList.add(iEmployeeRepository.findById(employeeId).get());
                return employeeList.toString();

            }
        }


        //updateEmployeeById
    public String UpdateEmployeeByUsingId(Long employeeId, Employee employee) {
        Optional<Employee> employeeIdList = iEmployeeRepository.findById(employeeId);
        employee.setEmployeeId(employeeId);
        if(employeeIdList.isEmpty())return "EmployeeId not found";
        else {
            iEmployeeRepository.save(employee);
                    return "Updated!!!";
        }

    }

    //deleteEmployeeById

    public void deleteEmployeeId(Long employeeId) {
        iEmployeeRepository.deleteById(employeeId);
    }


}
