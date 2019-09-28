package com.in28minutes.rest.webservices.restfulwebservices.service;


import com.in28minutes.rest.webservices.restfulwebservices.combeans.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.math.BigInteger;
import java.util.stream.Collectors;

@Repository
public class EmployeeDAO {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    private static Employees list = new Employees();

    public Employees getAllEmployees()
    {
        return list;
    }

    public void addEmployee(Employee employee) {
        list.getEmployeeList().add(employee);
    }


    public java.util.List<Employee> getEmployeeList() {
        List<Map<String, Object>> employees = jdbcTemplate.queryForList("SELECT * FROM EMPLOYEES");
        return employees.stream().map(e -> {
            Employee employee = new Employee();
            employee.setEmployeeName(e.get("FIRST_NAME").toString());
            employee.setEmployeeId((BigDecimal) e.get("EMPLOYEE_ID"));
            employee.setEmployeeRole((String) e.get("LAST_NAME"));
            return employee;
        }).collect(Collectors.toList());

    }

    public java.util.List<Employee> getEmployee(BigDecimal id) {
        List<Map<String, Object>> employees = jdbcTemplate.queryForList("SELECT * FROM EMPLOYEES WHERE EMPLOYEE_ID="+ id);
        return employees.stream().map(e -> {
            Employee employee = new Employee();
            employee.setEmployeeName(e.get("FIRST_NAME").toString());
            employee.setEmployeeId((BigDecimal) e.get("EMPLOYEE_ID"));
            employee.setEmployeeRole((String) e.get("LAST_NAME"));
            return employee;
        }).collect(Collectors.toList());

    }



}
