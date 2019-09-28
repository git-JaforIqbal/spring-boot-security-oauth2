package com.in28minutes.rest.webservices.restfulwebservices.combeans;

import java.math.BigDecimal;

public class Employee {

//    private int employeeId;
    private BigDecimal employeeId;
    private String employeeName;
    private String employeeRole;

    public Employee(){

    }
    public Employee(BigDecimal employeeId, String employeeName, String employeeRole) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.employeeRole = employeeRole;
    }

    public BigDecimal getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(BigDecimal employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getEmployeeRole() {
        return employeeRole;
    }

    public void setEmployeeRole(String employeeRole) {
        this.employeeRole = employeeRole;
    }


    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", employeeName='" + employeeName + '\'' +
                ", employeeRole='" + employeeRole + '\'' +
                '}';
    }
}
