package com.hostelhub.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AdminPage {

    WebDriver driver;
    WebDriverWait wait;

    public AdminPage(WebDriver driver) {

        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(20));
    }

    // ---------------- LOGIN PAGE LOCATORS ----------------

    By loginLink = By.xpath("//a[contains(text(),'Login')]");

    By emailField = By.xpath("//input[@type='email']");

    By passwordField = By.xpath("//input[@type='password']");

    By loginButton = By.xpath("//button[@type='submit']");

    // ---------------- HOSTEL PAGE LOCATORS ----------------

    By dashboardMenu = By.xpath("//span[contains(text(),'Dashboard')]");

    By myHostelsMenu = By.xpath("//span[contains(text(),'My Hostels')]");

    By inventoryMenu = By.xpath("//span[contains(text(),'Inventory')]");

    By bookingsMenu = By.xpath("//span[contains(text(),'Bookings')]");

    By tenantsMenu = By.xpath("//span[contains(text(),'Tenants')]");

    By paymentsMenu = By.xpath("//span[contains(text(),'Payments')]");

    By complaintsMenu = By.xpath("//span[contains(text(),'Complaints')]");

    By attendanceMenu = By.xpath("//span[contains(text(),'Attendance')]");

    By maintenanceMenu = By.xpath("//span[contains(text(),'Maintenance')]");

    By backToSite = By.xpath("//span[contains(text(),'Back To Site')]");

    // ---------------- LOGIN METHODS ----------------

    public void openLoginPage(String url) {

        driver.get(url);
        driver.manage().window().maximize();
    }

    public void clickLoginLink() {

        wait.until(ExpectedConditions.elementToBeClickable(loginLink));

        driver.findElement(loginLink).click();
    }

    public void enterEmail(String email) {

        wait.until(ExpectedConditions.visibilityOfElementLocated(emailField));

        WebElement emailBox = driver.findElement(emailField);

        ((JavascriptExecutor) driver)
                .executeScript("arguments[0].scrollIntoView(true);", emailBox);

        emailBox.clear();
        emailBox.sendKeys(email);
    }

    public void enterPassword(String password) {

        wait.until(ExpectedConditions.visibilityOfElementLocated(passwordField));

        WebElement passBox = driver.findElement(passwordField);

        passBox.clear();
        passBox.sendKeys(password);
    }

    public void clickLoginButton() {

        wait.until(ExpectedConditions.elementToBeClickable(loginButton));

        driver.findElement(loginButton).click();
    }

    // ---------------- HOSTEL PAGE METHODS ----------------

    public boolean isDashboardDisplayed() {

        wait.until(ExpectedConditions.visibilityOfElementLocated(dashboardMenu));

        return driver.findElement(dashboardMenu).isDisplayed();
    }

    public void clickDashboard() {

        driver.findElement(dashboardMenu).click();
    }

    public void clickMyHostels() {

        driver.findElement(myHostelsMenu).click();
    }

    public void clickInventory() {

        driver.findElement(inventoryMenu).click();
    }

    public void clickBookings() {

        driver.findElement(bookingsMenu).click();
    }

    public boolean isBookingsDisplayed() {

        return driver.findElement(bookingsMenu).isDisplayed();
    }

    public void clickTenants() {

        driver.findElement(tenantsMenu).click();
    }

    public void clickPayments() {

        driver.findElement(paymentsMenu).click();
    }

    public boolean isPaymentsDisplayed() {

        return driver.findElement(paymentsMenu).isDisplayed();
    }

    public void clickComplaints() {

        driver.findElement(complaintsMenu).click();
    }

    public void clickAttendance() {

        driver.findElement(attendanceMenu).click();
    }

    public void clickMaintenance() {

        driver.findElement(maintenanceMenu).click();
    }

    public void clickBackToSite() {

        driver.findElement(backToSite).click();
    }
}