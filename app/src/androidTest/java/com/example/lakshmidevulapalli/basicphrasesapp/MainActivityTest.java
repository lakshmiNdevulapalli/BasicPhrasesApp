package com.example.lakshmidevulapalli.basicphrasesapp;


import android.support.test.espresso.ViewInteraction;
import android.support.test.filters.LargeTest;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;

import org.hamcrest.Description;
import org.hamcrest.Matcher;
import org.hamcrest.TypeSafeMatcher;
import org.hamcrest.core.IsInstanceOf;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withClassName;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.Matchers.allOf;
import static org.hamcrest.Matchers.is;

@LargeTest
@RunWith(AndroidJUnit4.class)
public class MainActivityTest {

    @Rule
    public ActivityTestRule<MainActivity> mActivityTestRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void mainActivityTest() {
        ViewInteraction appCompatButton = onView(
                allOf(withId(R.id.hello), withText("Hello"),
                        childAtPosition(
                                allOf(withId(R.id.gridLayout),
                                        childAtPosition(
                                                withClassName(is("android.support.constraint.ConstraintLayout")),
                                                0)),
                                0),
                        isDisplayed()));
        appCompatButton.perform(click());

        ViewInteraction appCompatButton2 = onView(
                allOf(withId(R.id.howareyou), withText("How are you?"),
                        childAtPosition(
                                allOf(withId(R.id.gridLayout),
                                        childAtPosition(
                                                withClassName(is("android.support.constraint.ConstraintLayout")),
                                                0)),
                                1),
                        isDisplayed()));
        appCompatButton2.perform(click());

        ViewInteraction appCompatButton3 = onView(
                allOf(withId(R.id.goodevening), withText("Good Evening"),
                        childAtPosition(
                                allOf(withId(R.id.gridLayout),
                                        childAtPosition(
                                                withClassName(is("android.support.constraint.ConstraintLayout")),
                                                0)),
                                2),
                        isDisplayed()));
        appCompatButton3.perform(click());

        ViewInteraction appCompatButton4 = onView(
                allOf(withId(R.id.please), withText("Please"),
                        childAtPosition(
                                allOf(withId(R.id.gridLayout),
                                        childAtPosition(
                                                withClassName(is("android.support.constraint.ConstraintLayout")),
                                                0)),
                                3),
                        isDisplayed()));
        appCompatButton4.perform(click());

        ViewInteraction appCompatButton5 = onView(
                allOf(withId(R.id.mynameis), withText("My name is..."),
                        childAtPosition(
                                allOf(withId(R.id.gridLayout),
                                        childAtPosition(
                                                withClassName(is("android.support.constraint.ConstraintLayout")),
                                                0)),
                                4),
                        isDisplayed()));
        appCompatButton5.perform(click());

        ViewInteraction appCompatButton6 = onView(
                allOf(withId(R.id.doyouspeakenglish), withText("Do you \nspeak English?"),
                        childAtPosition(
                                allOf(withId(R.id.gridLayout),
                                        childAtPosition(
                                                withClassName(is("android.support.constraint.ConstraintLayout")),
                                                0)),
                                5),
                        isDisplayed()));
        appCompatButton6.perform(click());

        ViewInteraction appCompatButton7 = onView(
                allOf(withId(R.id.welcome), withText("Welcome"),
                        childAtPosition(
                                allOf(withId(R.id.gridLayout),
                                        childAtPosition(
                                                withClassName(is("android.support.constraint.ConstraintLayout")),
                                                0)),
                                6),
                        isDisplayed()));
        appCompatButton7.perform(click());

        ViewInteraction appCompatButton8 = onView(
                allOf(withId(R.id.ilivein), withText("I live in..."),
                        childAtPosition(
                                allOf(withId(R.id.gridLayout),
                                        childAtPosition(
                                                withClassName(is("android.support.constraint.ConstraintLayout")),
                                                0)),
                                7),
                        isDisplayed()));
        appCompatButton8.perform(click());

        ViewInteraction appCompatButton9 = onView(
                allOf(withId(R.id.welcome), withText("Welcome"),
                        childAtPosition(
                                allOf(withId(R.id.gridLayout),
                                        childAtPosition(
                                                withClassName(is("android.support.constraint.ConstraintLayout")),
                                                0)),
                                6),
                        isDisplayed()));
        appCompatButton9.perform(click());

        ViewInteraction appCompatButton10 = onView(
                allOf(withId(R.id.doyouspeakenglish), withText("Do you \nspeak English?"),
                        childAtPosition(
                                allOf(withId(R.id.gridLayout),
                                        childAtPosition(
                                                withClassName(is("android.support.constraint.ConstraintLayout")),
                                                0)),
                                5),
                        isDisplayed()));
        appCompatButton10.perform(click());

        ViewInteraction appCompatButton11 = onView(
                allOf(withId(R.id.mynameis), withText("My name is..."),
                        childAtPosition(
                                allOf(withId(R.id.gridLayout),
                                        childAtPosition(
                                                withClassName(is("android.support.constraint.ConstraintLayout")),
                                                0)),
                                4),
                        isDisplayed()));
        appCompatButton11.perform(click());

        ViewInteraction appCompatButton12 = onView(
                allOf(withId(R.id.please), withText("Please"),
                        childAtPosition(
                                allOf(withId(R.id.gridLayout),
                                        childAtPosition(
                                                withClassName(is("android.support.constraint.ConstraintLayout")),
                                                0)),
                                3),
                        isDisplayed()));
        appCompatButton12.perform(click());

        ViewInteraction appCompatButton13 = onView(
                allOf(withId(R.id.goodevening), withText("Good Evening"),
                        childAtPosition(
                                allOf(withId(R.id.gridLayout),
                                        childAtPosition(
                                                withClassName(is("android.support.constraint.ConstraintLayout")),
                                                0)),
                                2),
                        isDisplayed()));
        appCompatButton13.perform(click());

        ViewInteraction appCompatButton14 = onView(
                allOf(withId(R.id.howareyou), withText("How are you?"),
                        childAtPosition(
                                allOf(withId(R.id.gridLayout),
                                        childAtPosition(
                                                withClassName(is("android.support.constraint.ConstraintLayout")),
                                                0)),
                                1),
                        isDisplayed()));
        appCompatButton14.perform(click());

        ViewInteraction appCompatButton15 = onView(
                allOf(withId(R.id.hello), withText("Hello"),
                        childAtPosition(
                                allOf(withId(R.id.gridLayout),
                                        childAtPosition(
                                                withClassName(is("android.support.constraint.ConstraintLayout")),
                                                0)),
                                0),
                        isDisplayed()));
        appCompatButton15.perform(click());

        ViewInteraction appCompatButton16 = onView(
                allOf(withId(R.id.ilivein), withText("I live in..."),
                        childAtPosition(
                                allOf(withId(R.id.gridLayout),
                                        childAtPosition(
                                                withClassName(is("android.support.constraint.ConstraintLayout")),
                                                0)),
                                7),
                        isDisplayed()));
        appCompatButton16.perform(click());

        ViewInteraction button = onView(
                allOf(withId(R.id.hello),
                        childAtPosition(
                                allOf(withId(R.id.gridLayout),
                                        childAtPosition(
                                                IsInstanceOf.<View>instanceOf(android.view.ViewGroup.class),
                                                0)),
                                0),
                        isDisplayed()));
        button.check(matches(isDisplayed()));

        ViewInteraction button2 = onView(
                allOf(withId(R.id.howareyou),
                        childAtPosition(
                                allOf(withId(R.id.gridLayout),
                                        childAtPosition(
                                                IsInstanceOf.<View>instanceOf(android.view.ViewGroup.class),
                                                0)),
                                1),
                        isDisplayed()));
        button2.check(matches(isDisplayed()));

        ViewInteraction button3 = onView(
                allOf(withId(R.id.goodevening),
                        childAtPosition(
                                allOf(withId(R.id.gridLayout),
                                        childAtPosition(
                                                IsInstanceOf.<View>instanceOf(android.view.ViewGroup.class),
                                                0)),
                                2),
                        isDisplayed()));
        button3.check(matches(isDisplayed()));

        ViewInteraction button4 = onView(
                allOf(withId(R.id.please),
                        childAtPosition(
                                allOf(withId(R.id.gridLayout),
                                        childAtPosition(
                                                IsInstanceOf.<View>instanceOf(android.view.ViewGroup.class),
                                                0)),
                                3),
                        isDisplayed()));
        button4.check(matches(isDisplayed()));

        ViewInteraction button5 = onView(
                allOf(withId(R.id.mynameis),
                        childAtPosition(
                                allOf(withId(R.id.gridLayout),
                                        childAtPosition(
                                                IsInstanceOf.<View>instanceOf(android.view.ViewGroup.class),
                                                0)),
                                4),
                        isDisplayed()));
        button5.check(matches(isDisplayed()));

        ViewInteraction button6 = onView(
                allOf(withId(R.id.doyouspeakenglish),
                        childAtPosition(
                                allOf(withId(R.id.gridLayout),
                                        childAtPosition(
                                                IsInstanceOf.<View>instanceOf(android.view.ViewGroup.class),
                                                0)),
                                5),
                        isDisplayed()));
        button6.check(matches(isDisplayed()));

        ViewInteraction button7 = onView(
                allOf(withId(R.id.welcome),
                        childAtPosition(
                                allOf(withId(R.id.gridLayout),
                                        childAtPosition(
                                                IsInstanceOf.<View>instanceOf(android.view.ViewGroup.class),
                                                0)),
                                6),
                        isDisplayed()));
        button7.check(matches(isDisplayed()));

        ViewInteraction button8 = onView(
                allOf(withId(R.id.ilivein),
                        childAtPosition(
                                allOf(withId(R.id.gridLayout),
                                        childAtPosition(
                                                IsInstanceOf.<View>instanceOf(android.view.ViewGroup.class),
                                                0)),
                                7),
                        isDisplayed()));
        button8.check(matches(isDisplayed()));

        ViewInteraction button9 = onView(
                allOf(withId(R.id.ilivein),
                        childAtPosition(
                                allOf(withId(R.id.gridLayout),
                                        childAtPosition(
                                                IsInstanceOf.<View>instanceOf(android.view.ViewGroup.class),
                                                0)),
                                7),
                        isDisplayed()));
        button9.check(matches(isDisplayed()));
    }

    private static Matcher<View> childAtPosition(
            final Matcher<View> parentMatcher, final int position) {

        return new TypeSafeMatcher<View>() {
            @Override
            public void describeTo(Description description) {
                description.appendText("Child at position " + position + " in parent ");
                parentMatcher.describeTo(description);
            }

            @Override
            public boolean matchesSafely(View view) {
                ViewParent parent = view.getParent();
                return parent instanceof ViewGroup && parentMatcher.matches(parent)
                        && view.equals(((ViewGroup) parent).getChildAt(position));
            }
        };
    }
}
