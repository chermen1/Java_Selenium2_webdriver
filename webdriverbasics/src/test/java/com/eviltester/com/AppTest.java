package com.eviltester.com;

import org.junit.Assert;
import static junit.framework.Assert.assertEquals;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

import static junit.framework.Assert.assertTrue;

import static org.junit.Assert.*;


/**
 * Created by cdzebisov on 07/11/2016.
 */
public class AppTest {
    @Test
    public void startWebDriver() {
     /* The following code is for the Chrome Driver
           You also need to download the ChromeDriver executable
           https://sites.google.com/a/chromium.org/chromedriver/
         */
        //String currentDir = System.getProperty("user.dir");
        String chromeDriverLocation = "/Users/cdzebisov/Desktop/cher/tools/webdrivers/chromedriver";
        System.setProperty("webdriver.chrome.driver", chromeDriverLocation);

        //If you add the folder with chromedriver.exe to the path then you only need the following line
        // and you don't need to set the property as listed in the 3 lines above
        // e.g. D:\Users\Alan\Documents\github\startUsingSeleniumWebDriver\tools\chromedriver
        WebDriver driver = new ChromeDriver();

        driver.navigate().to("http://seleniumsimplified.com");
        //driver.navigate().to("http://google.com");
        //driver.navigate().back();
        driver.manage().window().maximize();
        Assert.assertTrue("title should start differently",driver.getTitle().startsWith("xxSelenium Simplified"));
        Assert.assertFalse( "title", driver.getTitle().startsWith("Selenium x Simplified"));
        //driver.close();
        //driver.quit();
    }
    @Test
    public void ChromeIsSupportedByWebDriver(){
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.compendiumdev.co.uk/selenium");
        assertTrue( driver.getTitle().startsWith("Selenium Simplified"));
        driver.close();
        driver.quit();
    }
    @Test
        public void aBasicJUnitTest(){
        System.out.println("/test message");
            assertEquals("2+2=4", 4, 2+2);
            assertEquals("TEST message", true, 2>1);
        }
    @Test
    public void testApp()
    {
        assertTrue( true );
    }
    @Test
    public void driverIsTheKing() {
        WebDriver driver = new HtmlUnitDriver(true);
        driver.get("http://www.compendiumdev.co.uk/selenium");
        assertTrue(driver.getTitle().startsWith("Selenium Simplified"));
    }

}
