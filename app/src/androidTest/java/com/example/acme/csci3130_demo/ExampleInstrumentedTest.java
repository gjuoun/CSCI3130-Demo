package com.example.acme.csci3130_demo;

import android.content.Context;
import android.support.test.InstrumentationRegistry;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import android.support.test.espresso.Espresso;
import android.widget.EditText;

import static android.support.test.espresso.action.ViewActions.clearText;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.assertion.ViewAssertions.*;
import static android.support.test.espresso.matcher.ViewMatchers.*;
import static org.junit.Assert.*;

/**
 * Instrumented test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith(AndroidJUnit4.class)
public class ExampleInstrumentedTest {
    @Rule
    public ActivityTestRule<MainActivity> mActivityRule = new ActivityTestRule(MainActivity.class);

    @Test
    public void testType() {
        Espresso.onView(withId(R.id.editText)).perform(click(), clearText(), typeText("jJn"));
        Espresso.onView(withId(R.id.button)).perform(click());
//        Espresso.onView(withText("jun")).check(matches(isDisplayed()));
        Espresso.onView(withId(R.id.textView)).check(matches(withText(("jJn\n"))));

    }

//    @Test
//    public void listGoesOverTheFold() {
//        Espresso.onView(withText("Hello")).check(matches(isDisplayed()));
//    }

    @Test
    public void useAppContext() throws Exception {
        // Context of the app under test.
        Context appContext = InstrumentationRegistry.getTargetContext();

        assertEquals("com.example.acme.csci3130_demo", appContext.getPackageName());
    }


}
