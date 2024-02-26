package com.sampletest;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FirstSampleTest {

    WebDriver webDriver;

    final static String STAGING_URL = "https://staging.bito.ai/auth/login";
    final static String PROD_URL = "https://alpha.bito.ai/auth/login";


    @BeforeTest
    public void setUp() {

        WebDriverManager.chromedriver().setup();
        webDriver = new ChromeDriver();

        webDriver.get(STAGING_URL);
        // webDriver.get(PROD_URL);

        String appTitle = webDriver.getTitle();
        try {
            System.out.println("Application title is :: " + appTitle);
            Thread.sleep(800);
        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }

    @AfterTest
    public void tearDown() {
        System.out.println("Going to close browser ------------------- ");
        webDriver.quit();
    }

    @Test
    public void testPage() {
        String currentURL = webDriver.getCurrentUrl();
        assertTrue(currentURL != "");
    }

}
