package com.example.acme.csci3130_demo;

public class Validator {
    private String password;

    public Validator() {
    }

    public boolean validate(String password) {
        this.password = password;

        String atLeastOneLowerAndUpperCase = "(?=.*[a-z])(?=.*[A-Z]).{8,}";
        String atLeastOneSpecialChar = "(?=.*[@#$%^&+=]).{8,}";
        String atLeastOneDigit = "(?=.*[0-9]).{8,}";


        if(this.password.equals("password") )
            return false;
        else if(this.password.length() < 8)
            return false;
        else if(!password.matches(atLeastOneLowerAndUpperCase))
            return false;
        else if(!password.matches(atLeastOneSpecialChar))
            return false;
        else if(!password.matches(atLeastOneDigit))
            return false;

        return true;
    }

}
