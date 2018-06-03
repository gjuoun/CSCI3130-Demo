package com.example.acme.csci3130_demo;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class ValidatorTest {
    private static Validator validator;

    @BeforeClass
    public static void initClass(){
        validator = new Validator("password");
    }

    @Test
    public void testValidate() {
        assertTrue(validator.validate());
    }

    @Test
    public void testGetPassword() {
        assertEquals("password", validator.getPassword());
    }

}