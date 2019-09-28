package com.in28minutes.rest.webservices.restfulwebservices.user;

public class Users {


    public String USERNAME;
    public String NAME;

    public Users(String USERNAME, String NAME) {
        this.USERNAME = USERNAME;
        this.NAME = NAME;
    }

    public String getUSERNAME() {
        return USERNAME;
    }

    public void setUSERNAME(String USERNAME) {
        this.USERNAME = USERNAME;
    }

    public String getNAME() {
        return NAME;
    }

    public void setNAME(String NAME) {
        this.NAME = NAME;
    }

    @Override
    public String toString() {
        return "Users{" +
                "USERNAME='" + USERNAME + '\'' +
                ", NAME='" + NAME + '\'' +
                '}';
    }
}
