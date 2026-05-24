package com.hostelhub.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegistrationPage {

    WebDriver driver;

    // Constructor

    public RegistrationPage(WebDriver driver) {

        this.driver = driver;
    }

    // Locators

    By getStartedBtn =
            By.xpath("//a[contains(text(),'Get Started')]");

    By fullName =
            By.xpath("//input[@placeholder='rajesh kumar']");

    By email =
            By.xpath("//input[@placeholder='you@example.com']");

    By phone =
            By.xpath("//input[@placeholder='9876543210']");

    By password =
            By.xpath("//input[@placeholder='Min 8 chars, 1 uppercase, 1 number']");

    By confirmPassword =
            By.xpath("//input[@placeholder='Confirm your password']");

    By createAccountBtn =
            By.xpath("//button[contains(text(),'Create Account')]");

    // Actions Methods

    public void clickGetStarted() {

        driver.findElement(getStartedBtn).click();
    }

    public void enterFullName(String fname) {

        driver.findElement(fullName).sendKeys(fname);
    }

    public void enterEmail(String mail) {

        driver.findElement(email).sendKeys(mail);
    }

    public void enterPhone(String phno) {

        driver.findElement(phone).sendKeys(phno);
    }

    public void enterPassword(String pwd) {

        driver.findElement(password).sendKeys(pwd);
    }

    public void enterConfirmPassword(String cpwd) {

        driver.findElement(confirmPassword).sendKeys(cpwd);
    }

    public void clickCreateAccount() {

        driver.findElement(createAccountBtn).click();
    }
}