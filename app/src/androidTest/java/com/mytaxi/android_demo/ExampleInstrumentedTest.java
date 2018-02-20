package com.mytaxi.android_demo;

import android.support.test.runner.AndroidJUnit4;
import android.support.test.rule.ActivityTestRule;
import com.mytaxi.android_demo.activities.AuthenticationActivity;
import com.mytaxi.android_demo.PageObjectModel.LoginScreen;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)

public class ExampleInstrumentedTest  {

    @Rule
    public ActivityTestRule<AuthenticationActivity> mLoginActivityTestRule =
            new ActivityTestRule<AuthenticationActivity>(AuthenticationActivity.class);

    private AuthenticationActivity mActivity = null;

    @Before
    public void setActivity() {
        mActivity = mLoginActivityTestRule.getActivity();
    }

    @Test
    public void checkLoginFunctionality()  {
        LoginScreen.assertUserNameFieldPresent();
        LoginScreen.enterUserName();
        LoginScreen.assertPasswordFieldPresent();
        LoginScreen.enterPassword();
        LoginScreen.assertLoginButtonPresent();
        LoginScreen.clickLogin();
        //To-Do: Search for Driver Name and Call.
    }
}
