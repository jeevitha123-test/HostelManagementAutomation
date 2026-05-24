package com.hostelhub.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.hostelhub.base.BaseClass;
import com.hostelhub.pages.AdminPage;
import com.hostelhub.pages.LoginPage;

public class AdminTest extends BaseClass {

    @Test
    public void adminDashboardTest() throws InterruptedException {

        // Create Login Page Object

        LoginPage lp = new LoginPage(driver);

        // Open Login Page

        lp.openLoginPage();

        Thread.sleep(2000);

        // Enter Admin Email

        lp.enterEmail("admin1@stayease.com");

        Thread.sleep(1000);

        // Enter Admin Password

        lp.enterPassword("Test@1234");

        Thread.sleep(1000);

        // Click Login Button

        lp.clickLogin();

        Thread.sleep(8000);

        // Create Admin Page Object

        AdminPage ap = new AdminPage(driver);

        // Verify Dashboard Displayed

        Assert.assertTrue(ap.isDashboardDisplayed());

        Thread.sleep(2000);

        // Click Dashboard

        ap.clickDashboard();

        Thread.sleep(2000);

        // Click My Hostels

        ap.clickMyHostels();

        Thread.sleep(2000);

        // Click Inventory

        ap.clickInventory();

        Thread.sleep(2000);

        // Click Bookings

        ap.clickBookings();

        Thread.sleep(2000);

        // Verify Bookings Displayed

        Assert.assertTrue(ap.isBookingsDisplayed());

        // Click Tenants

        ap.clickTenants();

        Thread.sleep(2000);

        // Click Payments

        ap.clickPayments();

        Thread.sleep(2000);

        // Verify Payments Displayed

        Assert.assertTrue(ap.isPaymentsDisplayed());

        // Click Complaints

        ap.clickComplaints();

        Thread.sleep(2000);

        // Click Attendance

        ap.clickAttendance();

        Thread.sleep(2000);

        // Click Maintenance

        ap.clickMaintenance();

        Thread.sleep(2000);

        // Click Back To Site

        ap.clickBackToSite();

        Thread.sleep(3000);

        // Refresh Browser

        driver.navigate().refresh();

        Thread.sleep(3000);

        System.out.println("Admin Dashboard Test Passed");
    }
}