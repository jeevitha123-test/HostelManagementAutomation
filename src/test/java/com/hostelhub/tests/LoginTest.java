package com.hostelhub.tests;

import java.io.IOException;

import org.testng.annotations.Test;

import com.hostelhub.base.BaseClass;
import com.hostelhub.pages.LoginPage;
import com.hostelhub.utilities.ExcelUtility;
import com.hostelhub.utilities.ScreenshotUtility;
import com.hostelhub.utilities.WaitUtility;

public class LoginTest extends BaseClass {

    @Test
    public void verifyValidLogin() throws IOException, InterruptedException {

        // Create LoginPage Object
        LoginPage lp = new LoginPage(driver);

        // Read Data From Excel
        String email = ExcelUtility.getData(1, 1);
        String password = ExcelUtility.getData(1, 2);

        // Open Login Page
        lp.openLoginPage();

        // Enter Email
        lp.enterEmail(email);

        // Enter Password
        lp.enterPassword(password);

        // Click Login Button
        lp.clickLogin();

        // Wait for Dashboard Element
        WaitUtility.waitForElement(driver,
                lp.getDashboardText(),
                10);
        // Timestamp for Screenshot
        String timestamp =
                String.valueOf(System.currentTimeMillis());

        // Capture Screenshot
        ScreenshotUtility.takeScreenshot(driver,
                "LoginPage_" + timestamp);

        System.out.println("Login Test Executed Successfully");
    }
}