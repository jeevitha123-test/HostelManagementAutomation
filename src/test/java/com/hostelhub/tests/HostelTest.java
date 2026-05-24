package com.hostelhub.tests;

import org.testng.annotations.Test;

import com.hostelhub.base.BaseClass;
import com.hostelhub.pages.HostelPage;
import com.hostelhub.pages.LoginPage;

public class HostelTest extends BaseClass {

    @Test
    public void createHostelTest() throws InterruptedException {

        // Create LoginPage Object
        LoginPage lp = new LoginPage(driver);

     // Click Login Link
        lp.openLoginPage();

        Thread.sleep(2000);

        // Enter Email
        lp.enterEmail("superadmin@stayease.com");

        // Enter Password
        lp.enterPassword("Test@1234");

        // Click Login Button
        lp.clickLogin();

        Thread.sleep(3000);

        // Open Hostel Page
        driver.get("https://hostelproject-eta.vercel.app/super-admin/hostels");

        Thread.sleep(3000);

        // Create HostelPage Object
        HostelPage hp = new HostelPage(driver);

        // Enter Hostel Name
        hp.enterHostelName("ABC Boys Hostel");

        // Enter Slug
        hp.enterSlug("abc-boys-hostel");

        // Enter Description
        hp.enterDescription("Best hostel in Hyderabad with wifi and food");

        // Select Hostel Type
        hp.selectHostelType("Boys");

        // Enter Address
        hp.enterAddress("Madhapur");

        // Enter City
        hp.enterCity("Hyderabad");

        // Enter Pincode
        hp.enterPincode("500081");

        // Enter Phone
        hp.enterPhone("9876543210");

        // Enter Email
        hp.enterEmail("abcboys@gmail.com");

        // Enter Latitude
        hp.enterLatitude("17.3850");

        // Enter Longitude
        hp.enterLongitude("78.4867");

        // Enter Image URL
        hp.enterImageURL(
        "https://images.unsplash.com/photo-1566073771259-6a8506099945");

        Thread.sleep(2000);

        // Click Create Hostel Button
        hp.clickCreateHostel();

        Thread.sleep(5000);

        System.out.println("Hostel Created Successfully");
    }
}