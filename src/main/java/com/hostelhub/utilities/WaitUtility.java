package com.hostelhub.utilities;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitUtility {

    // Wait for Element Visibility
    public static void waitForElement(WebDriver driver,
                                      WebElement element,
                                      int seconds) {

        WebDriverWait wait =
                new WebDriverWait(driver,
                Duration.ofSeconds(seconds));

        wait.until(
                ExpectedConditions.visibilityOf(element));
    }
}
