package com.hostelhub.utilities;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class JavaScriptUtility {

    WebDriver driver;
    JavascriptExecutor js;

    // Constructor
    public JavaScriptUtility(WebDriver driver) {
        this.driver = driver;
        this.js = (JavascriptExecutor) driver;
    }

    // Click element using JavaScript
    public void clickElement(WebElement element) {
        js.executeScript("arguments[0].click();", element);
    }

    // Enter text using JavaScript
    public void enterText(WebElement element, String value) {
        js.executeScript("arguments[0].value=arguments[1];", element, value);
    }

    // Scroll to element
    public void scrollToElement(WebElement element) {
        js.executeScript("arguments[0].scrollIntoView(true);", element);
    }

    // Scroll down by pixels
    public void scrollDown(int pixels) {
        js.executeScript("window.scrollBy(0," + pixels + ")");
    }

    // Scroll up by pixels
    public void scrollUp(int pixels) {
        js.executeScript("window.scrollBy(0,-" + pixels + ")");
    }

    // Highlight element
    public void highlightElement(WebElement element) {
        js.executeScript("arguments[0].style.border='3px solid red'", element);
    }

    // Refresh page
    public void refreshPage() {
        js.executeScript("history.go(0)");
    }

    // Get page title
    public String getPageTitle() {
        return js.executeScript("return document.title").toString();
    }

    // Get page URL
    public String getPageURL() {
        return js.executeScript("return document.URL").toString();
    }
}
