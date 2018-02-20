package com.mytaxi.android_demo.PageObjectModel;
import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.closeSoftKeyboard;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import com.mytaxi.android_demo.R;

public class SearchDriverProfileScreen {

    private static int driverTextFieldId = R.id.textSearch;

    public static void assertDriverSearchTextFieldPresent() {
        onView(withId(driverTextFieldId)).check(matches(isDisplayed()));
    }

    public static void searchForDriverWithName() {
        onView(withId(driverTextFieldId)).perform(typeText("sa"), closeSoftKeyboard());
    }

}
