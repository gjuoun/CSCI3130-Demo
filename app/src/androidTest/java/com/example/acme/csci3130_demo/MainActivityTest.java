package com.example.acme.csci3130_demo;

import android.support.test.espresso.Espresso;
import android.support.test.rule.ActivityTestRule;

import org.junit.Rule;
import org.junit.Test;

import static android.support.test.espresso.action.ViewActions.*;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static org.junit.Assert.*;

public class MainActivityTest {
    @Rule
    public ActivityTestRule<MainActivity> mActivityRule = new ActivityTestRule(MainActivity.class);

    @Test
    public void onCreate() {

    }

    @Test
    public void testMessage() {
        Espresso.onView(withId(R.id.passwordText)).perform( typeText("123"),closeSoftKeyboard());
        Espresso.onView(withId(R.id.validateButton)).perform(click());
        Espresso.onView(withId(R.id.messageView)).check(matches(withText("Password is less than 8 characters long")));

        Espresso.onView(withId(R.id.passwordText)).perform( typeText("password"),closeSoftKeyboard());
        Espresso.onView(withId(R.id.validateButton)).perform(click());
        Espresso.onView(withId(R.id.messageView)).check(matches(withText("You can't just use 'password'")));

        Espresso.onView(withId(R.id.passwordText)).perform(typeText("aaaabbbbb"),closeSoftKeyboard());
        Espresso.onView(withId(R.id.validateButton)).perform(click());
        Espresso.onView(withId(R.id.messageView)).check(matches(withText("Password should have at least one upper and lower case")));

        Espresso.onView(withId(R.id.passwordText)).perform( typeText("Aaaabbbbb"),closeSoftKeyboard());
        Espresso.onView(withId(R.id.validateButton)).perform(click());
        Espresso.onView(withId(R.id.messageView)).check(matches(withText("Password has have at least one special character")));

        Espresso.onView(withId(R.id.passwordText)).perform( typeText("Aaaabbbbb@"),closeSoftKeyboard());
        Espresso.onView(withId(R.id.validateButton)).perform(click());
        Espresso.onView(withId(R.id.messageView)).check(matches(withText("Password should have at least one dight")));

        Espresso.onView(withId(R.id.passwordText)).perform(typeText("Aaaabbbbb@123"),closeSoftKeyboard());
        Espresso.onView(withId(R.id.validateButton)).perform(click());
        Espresso.onView(withId(R.id.messageView)).check(matches(withText("Your password is strong enough!")));
    }
}