package com.example.acme.csci3130_demo;

import java.util.HashMap;

public class Validator {
    private String password;

    public Validator() {
    }

    public Message validate(String password) {
        this.password = password;

        String atLeastOneLowerAndUpperCase = "(?=.*[a-z])(?=.*[A-Z]).{8,}";
        String atLeastOneSpecialChar = "(?=.*[@#$%^&+=]).{8,}";
        String atLeastOneDigit = "(?=.*[0-9]).{8,}";


        if(this.password.equals("password") )
            return new Message(false, "You can't just use 'password'");
        else if(this.password.length() < 8)
            return new Message(false, "Password is less than 8 characters long");
        else if(!password.matches(atLeastOneLowerAndUpperCase))
            return new Message(false,"Password should have at least one upper and lower case");
        else if(!password.matches(atLeastOneSpecialChar))
            return new Message(false, "Password has have at least one special character");
        else if(!password.matches(atLeastOneDigit))
            return new Message(false, "Password should have at least one dight");

        return new Message(true, "Your password is strong enough!");
    }

}

class Message{
    private boolean result;
    private String message;

    public Message(boolean result, String message) {
        this.result = result;
        this.message = message;
    }

    public boolean getResult() {
        return result;
    }

    public String getMessage() {
        return message;
    }
}
