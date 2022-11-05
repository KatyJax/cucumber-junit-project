package com.cydeo.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.util.concurrent.TimeUnit;

public class Driver {

    // creating a private constructor, so we are closing access to the object of this class
    private Driver(){}


    // making our driver instance, so that is not reachable from outside from any class
    // We make is static, because we want it to run before anything else, so we will use it in static method
    private static WebDriver driver;

    public static WebDriver getDriver(){

        if (driver == null){

        String browserType = ConfigurationReader.getProperty("browser");

        switch (browserType){
           case "chrome":
               WebDriverManager.chromedriver().setup();
               driver = new ChromeDriver();
               driver.manage().window().maximize();
               driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
               break;
           case "firefox":
               WebDriverManager.firefoxdriver().setup();
               driver = new FirefoxDriver();
               driver.manage().window().maximize();
              // driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
               break;
           case "safary":
               WebDriverManager.safaridriver().setup();
               driver = new SafariDriver();
               driver.manage().window().maximize();
              // driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
               break;
        }

        }
        return driver;
    }


    public static void closeDriver(){
        if (driver != null){
            driver.quit();  // this line will kill the session, value will now be null
        }
   }


}
