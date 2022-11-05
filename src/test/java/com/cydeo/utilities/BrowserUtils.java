package com.cydeo.utilities;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class BrowserUtils {
    // we don't want to create an obj to call those methods we just want to call those methods with class name, that's why static
    public static void  sleep(int seconds){

        try {
            Thread.sleep(seconds*1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
            System.out.println("Exeption happened in sleep method!");
        }
    }

    public static void switchWindowAndVerify (String expectedInUrl, String expectedTitle){

        Set<String> allWindowHandles = Driver.getDriver().getWindowHandles();

        for (String eachWindow : allWindowHandles) {
            Driver.getDriver().switchTo().window(eachWindow);

            if (Driver.getDriver().getCurrentUrl().contains(expectedInUrl)){
                break;
            }
        }

        String actualTitle = Driver.getDriver().getTitle();

        Assert.assertTrue("Title verification failed", actualTitle.contains(expectedTitle));
    }


    public static void verifyTitle(String expectedTitle){

        Assert.assertEquals(expectedTitle, Driver.getDriver().getTitle());
    }

    public static void waitForInvisibilityOf(WebElement element){
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 15);
        wait.until(ExpectedConditions.invisibilityOf(element));
    }


    /**
     * This method will eccept dropdown as a WebElement
     * ad return all the options text in a List of String
     * @return
     */
    public static List<String> dropdownOptionsAsString(WebElement dropdownElement){

        Select select = new Select(dropdownElement);

        // List of all ACTUAL month <options> as a WebElement
        List<WebElement> actualOptionsAsWebElement = select.getOptions();

        // List of all ACTUAL month <options> as a String
        List<String> actualOptionsAsString = new ArrayList<>();

        //  with using for loop we will convert each WebElement of options to String with using getText() method
        for (WebElement each : actualOptionsAsWebElement) {

            actualOptionsAsString.add(each.getText());
        }

        return actualOptionsAsString;
    }


    /**
     * This method will accept a group of radiobutton as a List<WebElement></WebElement>
     * it will loop through the List, and click to the radio btton with provided attribute value
     * @param radioButtons
     * @param attributeValue
     */
    public static void clickRadioButton(List<WebElement> radioButtons, String attributeValue){
        for (WebElement each : radioButtons) {
            if (each.getAttribute("value").equalsIgnoreCase(attributeValue)){
                each.click();
            }
        }
    }




}
