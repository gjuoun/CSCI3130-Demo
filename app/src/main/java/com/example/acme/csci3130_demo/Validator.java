package com.example.acme.csci3130_demo;

public class Validator {
    private String password;

    public Validator(String password) {
        this.password = password;
    }

    public boolean validate() {

        if(this.password.equals("password") )
            return false;
        else if(this.password.length() < 8)
            return false;

        return true;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
