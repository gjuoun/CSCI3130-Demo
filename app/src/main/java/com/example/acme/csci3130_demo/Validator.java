package com.example.acme.csci3130_demo;

public class Validator {
    private String password;

    public Validator(String password) {
        this.password = password;
    }

    public boolean validate() {
        return this.password.equals("password") && this.password.length() >= 8;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
