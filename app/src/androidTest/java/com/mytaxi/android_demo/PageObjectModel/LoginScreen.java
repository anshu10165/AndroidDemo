
package com.mytaxi.android_demo.PageObjectModel;
import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.closeSoftKeyboard;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import com.mytaxi.android_demo.R;

public class LoginScreen {

    private static int userNameId = R.id.edt_username;
    private static int passwordId = R.id.edt_password;
    private static int loginButtonId = R.id.btn_login;

    public static void assertUserNameFieldPresent() {
        onView(withId(userNameId)).check(matches(isDisplayed()));
    }

    public static void enterUserName() {
        onView(withId(userNameId)).perform(typeText("whiteelephant261"), closeSoftKeyboard());
    }

    public static void assertPasswordFieldPresent() {
        onView(withId(passwordId)).check(matches(isDisplayed()));
    }

    public static void enterPassword() {
        onView(withId(passwordId)).perform(typeText("video"), closeSoftKeyboard());
    }

    public static void assertLoginButtonPresent() {
        onView(withId(loginButtonId)).check(matches(isDisplayed()));
    }

    public static void clickLogin() {
        onView(withId(loginButtonId)).perform(click());
    }
}
