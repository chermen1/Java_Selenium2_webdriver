package com.eviltester.com;

//import org.junit.*;
//import static junit.framework.Assert.assertEquals;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


import static org.testng.AssertJUnit.assertEquals;
//import static junit.framework.Assert.assertTrue;


/**
 * Created by cdzebisov on 07/11/2016.
 */
public class AppTest {
    static WebDriver driver;
    @BeforeClass
        public static void startWebDriver() {
        //String currentDir = System.getProperty("user.dir");
            String chromeDriverLocation = "/Users/cdzebisov/Desktop/cher/tools/webdrivers/chromedriver";
            System.setProperty("webdriver.chrome.driver", chromeDriverLocation);
        //If you add the folder with chromedriver.exe to the path then you only need the following line
        // and you don't need to set the property as listed in the 3 lines above
        // e.g. D:\Users\Alan\Documents\github\startUsingSeleniumWebDriver\tools\chromedriver
            driver = new ChromeDriver();
    }
    @Test
        public void navigateDriver(){
            driver.navigate().to("http://seleniumsimplified.com");
            //driver.navigate().to("http://google.com");
            //driver.navigate().back();
            driver.manage().window().maximize();
            Assert.assertTrue(driver.getTitle().startsWith("xSelenium Simplified"), "---  FAIL ! ! ! --- : title should start differently");
            Assert.assertFalse( driver.getTitle().startsWith("Selenium Simplified"), "T I T L E");
        }
    @Test
        public void ChromeIsSupportedByWebDriver(){
            driver.get("http://www.compendiumdev.co.uk/selenium");
            Assert.assertTrue( driver.getTitle().startsWith("Selenium Simplified"));
        }
    @Test
        public void aBasicJUnitTest(){
            System.out.println("/test message");
            assertEquals("2+2=4", 4, 2+2);
            assertEquals("TEST message", true, 2>1);
        }
    @Test
        public void xySummVerivication() {
            int x=5;
            int y=4;
            int z=x+y;
            Assert.assertTrue( 8 == z , "5+4=9 this is the correct answer");
        System.out.println("5+4=9 this is the correct answer");
        }
    @Test
        public void driverIsTheKing() {
            WebDriver driver = new HtmlUnitDriver(true);
            driver.get("http://www.compendiumdev.co.uk/selenium");
            Assert.assertTrue(driver.getTitle().startsWith("Selenium Simplified"));
        }
    @AfterClass
        public static void closeDriver(){
            driver.close();
            driver.quit();
        }
}
