package com.in28minutes.rest.webservices.restfulwebservices.controllers;


import com.in28minutes.rest.webservices.restfulwebservices.combeans.Employee;
import com.in28minutes.rest.webservices.restfulwebservices.service.EmployeeDAO;
import com.in28minutes.rest.webservices.restfulwebservices.user.UserNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.lang.reflect.Array;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeDAO employeeDAO;

    @GetMapping("/practice")
    public int[] practice() {

        int[] result = {1,2,3,4};

        return result;
    }

    @GetMapping("/api/get-all-employee")
    public java.util.List getEmployeeList() {
        return employeeDAO.getEmployeeList();
    }

    @GetMapping("/api/get-all-employee/{id}")
    public List<Employee> getEmployee(@PathVariable BigDecimal id) {

        List<Employee> result = employeeDAO.getEmployee(id);
        if(result.isEmpty())
            throw new UserNotFoundException("id-"+id);

        return result;
    }




}
