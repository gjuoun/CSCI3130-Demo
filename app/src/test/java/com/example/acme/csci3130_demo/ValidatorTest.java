package com.example.acme.csci3130_demo;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import static org.junit.Assert.*;


@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ValidatorTest {
    private static Validator validator;
    private static Message message;

    @BeforeClass
    public static void initClass(){
        validator = new Validator();
    }

    @Test
    public void testValidateEasy() {
        assertFalse(validator.validate("password").getResult());
        assertFalse(validator.validate("123442").getResult());
        assertFalse(validator.validate("Wnasd@").getResult());
        assertFalse(validator.validate("Ccccnn").getResult());

    }

    @Test
    public void testValidateMedium() {
        assertFalse(validator.validate("Sccccccccccccc").getResult());
        assertFalse(validator.validate("Scc@ffffffffff").getResult());

        assertTrue(validator.validate("Ssddij2233@#$").getResult());
        assertTrue(validator.validate("Abcdefg$%#989").getResult());
    }


}