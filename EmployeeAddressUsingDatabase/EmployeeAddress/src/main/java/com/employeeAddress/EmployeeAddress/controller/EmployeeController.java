package com.employeeAddress.EmployeeAddress.controller;

import com.employeeAddress.EmployeeAddress.modules.Employee;
import com.employeeAddress.EmployeeAddress.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {
    @Autowired
    EmployeeService employeeService;

    //getAllEmployee
    @GetMapping(value = "allEmployee")
    public String getAllEmployee(){
        return employeeService.getAllEmployees();
    }


    //AddEmployee
    @PostMapping(value = "/addEmployee")
    public String addEmployee(@RequestBody List<Employee> employeeList){
        return employeeService.addEmployeesData(employeeList);
    }

    //getEmployeeById
    @GetMapping(value = "/getEmployeeId")
    public String getEmployeeId(@RequestParam Long employeeId){
        return employeeService.getEmployeeId(employeeId);
    }

    //UpdateEmployeeUsingId

    @PutMapping(value = "/updateEmployee/{employeeId}")

    public String UpdateEmployeeUsingId(@PathVariable Long employeeId , @RequestBody Employee employee){
        return employeeService.UpdateEmployeeByUsingId(employeeId ,employee);
    }

    //deleteEmployeeById

    @DeleteMapping(value = "deleteEmployee/{employeeId}")
    public void deleteEmployee(@PathVariable Long employeeId){
        employeeService.deleteEmployeeId(employeeId);
    }



}
