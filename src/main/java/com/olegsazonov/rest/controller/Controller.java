package com.olegsazonov.rest.controller;

import com.olegsazonov.rest.entity.Employee;
import com.olegsazonov.rest.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class Controller {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/employees")
    public List<Employee> showAllEmployees(){
    List<Employee> allEmployees = employeeService.getAllEmployees();
    return allEmployees;
    }
}
