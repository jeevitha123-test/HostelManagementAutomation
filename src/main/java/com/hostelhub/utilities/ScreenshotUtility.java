package com.hostelhub.utilities;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenshotUtility {

    // Method for taking screenshot
    public static void takeScreenshot(WebDriver driver, String fileName) throws IOException {

        // Convert driver to TakesScreenshot
        TakesScreenshot ts = (TakesScreenshot) driver;

        // Capture screenshot
        File src = ts.getScreenshotAs(OutputType.FILE);

        // Destination path
        File dest = new File("./Screenshots/" + fileName + ".png");

        // Copy file to Screenshots folder
        FileHandler.copy(src, dest);

        System.out.println("Screenshot captured successfully");
    }
}