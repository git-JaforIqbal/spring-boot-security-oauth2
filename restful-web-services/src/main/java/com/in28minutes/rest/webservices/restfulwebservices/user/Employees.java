package com.in28minutes.rest.webservices.restfulwebservices.user;

public class Employees {
    public String FIRST_NAME;
    public String LAST_NAME;

    public Employees(String FIRST_NAME, String LAST_NAME) {


        this.FIRST_NAME = FIRST_NAME;
        this.LAST_NAME = LAST_NAME;
    }

    public String getFIRST_NAME() {
        return FIRST_NAME;
    }

    public void setFIRST_NAME(String FIRST_NAME) {
        this.FIRST_NAME = FIRST_NAME;
    }

    public String getLAST_NAME() {
        return LAST_NAME;
    }

    public void setLAST_NAME(String LAST_NAME) {
        this.LAST_NAME = LAST_NAME;
    }

    @Override
    public String toString() {
        return "Employees{" +
                "FIRST_NAME='" + FIRST_NAME + '\'' +
                ", LAST_NAME='" + LAST_NAME + '\'' +
                '}';
    }
}
