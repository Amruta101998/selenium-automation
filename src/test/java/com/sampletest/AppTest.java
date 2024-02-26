package com.sampletest;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;



/**
 * Unit test for simple App.
 */
public class AppTest 
{
    @Test
    public void myTestSample() {
        System.out.println("Hello first test");
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://staging.bito.ai/auth/login");

        try{
            Thread.sleep(500);
        } catch(Exception e) {
            e.printStackTrace();

        }
        driver.close();
        
    }
}
