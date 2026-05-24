package com.hostelhub.tests;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import com.hostelhub.base.BaseClass;
import com.hostelhub.pages.RegistrationPage;
import com.hostelhub.utilities.ScreenshotUtility;

public class RegistrationTest extends BaseClass {

    @Test
    public void registrationTest() throws InterruptedException, IOException {

        // Create Registration Page Object

        RegistrationPage rp = new RegistrationPage(driver);

        // Click Get Started Button

        rp.clickGetStarted();

        Thread.sleep(3000);

        // Enter Full Name

        rp.enterFullName("Jeevitha Reddy");

        Thread.sleep(1000);

        // Enter Email

        rp.enterEmail("jeevitha@gmail.com");

        Thread.sleep(1000);

        // Enter Phone Number

        rp.enterPhone("9876543216");

        Thread.sleep(1000);

        // Scroll Down

        JavascriptExecutor js =
                (JavascriptExecutor) driver;

        js.executeScript("window.scrollBy(0,300)");

        Thread.sleep(2000);

        // Enter Password

        rp.enterPassword("Admin@123");

        Thread.sleep(2000);
        

        // Enter Confirm Password

        rp.enterConfirmPassword("Admin@123");

        Thread.sleep(2000);

        // Click Create Account Button

        rp.clickCreateAccount();
        //Thread.sleep(5000);

        System.out.println("Registration Successful");

        String timestamp =
        String.valueOf(System.currentTimeMillis());

        ScreenshotUtility.takeScreenshot(driver,
        "RegistrationTest_" + timestamp);
        
        
        
        

        Thread.sleep(5000);

        System.out.println("Registration Successful");
    }
}