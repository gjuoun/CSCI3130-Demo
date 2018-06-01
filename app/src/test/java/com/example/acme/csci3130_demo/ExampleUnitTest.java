package com.example.acme.csci3130_demo;


import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */


public class ExampleUnitTest {
    private People jun = new People("jun guo", "gjuoun@Gmail.com", "21346687", 28);


    @Test
    public void addition_isCorrect() throws Exception {
        assertEquals(4, 2 + 2);
    }

    @Test
    public void testAge() {
        assertEquals( 28,  jun.getAge());
    }

    @Test
    public void testBirthday() {
        jun.onBirthday();
        assertEquals( 29, jun.getAge());

    }

    @Test
    public void testSaying() {
        String msg = jun.say();
        assertEquals("happy", msg);
    }


}