package com.mytaxi.android_demo.PageObjectModel;
import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import com.mytaxi.android_demo.R;

public class DriverDetailsScreen {

    private static int floatingButtonId = R.id.fab;

    public static void assertCallToDriverButtonPresent() {
        onView(withId(floatingButtonId)).check(matches(isDisplayed()));
    }
    public static void callDriver() {
        onView(withId(floatingButtonId)).perform(click());
    }
}
