package com.hostelhub.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class HostelPage {

    WebDriver driver;

    // Constructor
    public HostelPage(WebDriver driver) {
        this.driver = driver;
    }

    // Locators

    By hostelName = By.xpath("//input[@placeholder='e.g. Green Valley Boys Hostel']");

    By slug = By.xpath("//input[@placeholder='e.g. green-valley-boys-hostel']");

    By description = By.xpath("//textarea[contains(@placeholder,'Describe the hostel')]");

    By hostelType = By.tagName("select");

    By address = By.xpath("//input[@placeholder='Street / Area']");

    By city = By.xpath("//input[@placeholder='Type city name...']");

    By pincode = By.xpath("//input[@placeholder='e.g. 500001']");

    By phone = By.xpath("//input[@placeholder='+91 9008700000']");

    By email = By.xpath("//input[@placeholder='hostel@email.com']");

    By latitude = By.xpath("//input[@placeholder='e.g. 17.3850']");

    By longitude = By.xpath("//input[@placeholder='e.g. 78.4867']");

    By image1 = By.xpath("//input[@placeholder='Primary image URL (required for listing)']");

    By publicListing = By.xpath("//input[@type='checkbox']");

    By createHostelBtn = By.xpath("//button[contains(text(),'Create Hostel')]");

    // Methods

    public void enterHostelName(String name) {
        driver.findElement(hostelName).sendKeys(name);
    }

    public void enterSlug(String slugName) {
        driver.findElement(slug).sendKeys(slugName);
    }

    public void enterDescription(String desc) {
        driver.findElement(description).sendKeys(desc);
    }

    public void selectHostelType(String type) {

        Select select = new Select(driver.findElement(hostelType));

        select.selectByVisibleText(type);
    }

    public void enterAddress(String addr) {
        driver.findElement(address).sendKeys(addr);
    }

    public void enterCity(String cityName) {
        driver.findElement(city).sendKeys(cityName);
    }

    public void enterPincode(String pin) {
        driver.findElement(pincode).sendKeys(pin);
    }

    public void enterPhone(String mobile) {
        driver.findElement(phone).sendKeys(mobile);
    }

    public void enterEmail(String mail) {
        driver.findElement(email).sendKeys(mail);
    }

    public void enterLatitude(String lat) {
        driver.findElement(latitude).sendKeys(lat);
    }

    public void enterLongitude(String lon) {
        driver.findElement(longitude).sendKeys(lon);
    }

    public void enterImageURL(String url) {
        driver.findElement(image1).sendKeys(url);
    }

    public void clickPublicListing() {
        driver.findElement(publicListing).click();
    }

    public void clickCreateHostel() {
        driver.findElement(createHostelBtn).click();
    }
}