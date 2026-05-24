package com.hostelhub.base;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.hostelhub.utilities.ConfigReader;

public class BaseClass {

    // Global WebDriver
    public static WebDriver driver;

    // Launch Browser

    @BeforeMethod
    public void setup() {

        // Load Config File
        ConfigReader.loadProperties();

        // Get values from config.properties
        String browser = ConfigReader.getProperty("browser");
        String url = ConfigReader.getProperty("url");

        // Chrome Browser
        if (browser.equalsIgnoreCase("chrome")) {

            driver = new ChromeDriver();
        }

        // Firefox Browser
        else if (browser.equalsIgnoreCase("firefox")) {

            System.setProperty("webdriver.gecko.driver",
                    "C:\\Users\\jeevi\\Downloads\\geckodriver-v0.36.0-win64\\geckodriver.exe");

            driver = new FirefoxDriver();
        }

        // Edge Browser
        else if (browser.equalsIgnoreCase("edge")) {

            System.setProperty("webdriver.edge.driver",
                    "C:\\Users\\jeevi\\Downloads\\edgedriver_win64\\msedgedriver.exe");

            driver = new EdgeDriver();
        }

        // Invalid Browser
        else {

            throw new IllegalArgumentException("Browser Not Supported");
        }

        // Maximize Window
        driver.manage().window().maximize();

        // Implicit Wait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        // Open Application URL
        driver.get(url);

        System.out.println(browser + " Browser Opened Successfully");
    }

    // Close Browser
    @AfterMethod
    public void tearDown() {

        //driver.quit();

        System.out.println("Browser Closed Successfully");
    }
}