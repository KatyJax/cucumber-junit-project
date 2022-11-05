package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EtsySearchPage {

    public EtsySearchPage(){
        PageFactory.initElements(Driver.getDriver(), this);

    }


    @FindBy(id = "global-enhancements-search-query")
    public WebElement searchBox;


    @FindBy(xpath = "//button[@type='submit']")
    public WebElement searchBtn;
}
