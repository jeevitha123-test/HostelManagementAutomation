package com.hostelhub.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

    WebDriver driver;

    // Constructor
    public LoginPage(WebDriver driver) {

        this.driver = driver;
    }

    // Locators
    By loginLink = By.xpath("//a[contains(text(),'Login')]");

    By email = By.xpath("//input[@type='text']");

    By password = By.name("password");

    By loginBtn = By.xpath("//button[@type='submit']");

    // Dashboard Element
    By dashboardText = By.xpath("//span[contains(text(),'Dashboard')]");

    // Click Login Link
    public void openLoginPage() throws InterruptedException {

        Thread.sleep(3000);
        driver.findElement(loginLink).click();
    }

    // Enter Email
    public void enterEmail(String mail) {

        driver.findElement(email).sendKeys(mail);
    }

    // Enter Password
    public void enterPassword(String pwd) {

        driver.findElement(password).sendKeys(pwd);
    }

    // Click Login Button
    public void clickLogin() {

        driver.findElement(loginBtn).click();
    }

    // Get Dashboard Element
    public WebElement getDashboardText() {

        return driver.findElement(dashboardText);
    }
}