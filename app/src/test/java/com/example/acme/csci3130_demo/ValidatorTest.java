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

    @BeforeClass
    public static void initClass(){
        validator = new Validator();
    }

    @Test
    public void testValidateEasy() {
        assertFalse(validator.validate("password"));
        assertFalse(validator.validate("123442"));
        assertFalse(validator.validate("Wnasd@"));
        assertFalse(validator.validate("Ccccnn"));

    }

    @Test
    public void testValidateMedium() {
        assertFalse(validator.validate("Sccccccccccccc"));
        assertFalse(validator.validate("Scc@ffffffffff"));

        assertTrue(validator.validate("Ssddij2233@#$"));
        assertTrue(validator.validate("Abcdefg$%#989"));
    }


}