package com.browser.pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage<SearchResultOne> {

    private WebDriver driver;

    public HomePage(WebDriver driver){
        this.driver = driver;
    }

    private final By SearchBarField = By.xpath("//input[@name='k']");
    private final By SearchIcon = By.xpath("//input[@value='Go']");
    private final By SearchResultOne =By.xpath("(//span[1]/a/div[1]/h2/span)[1]");

    public void SetValueInSearchField(String value){
        driver.findElement(SearchBarField).sendKeys(value);
    }

    public void ClickGoButton(){
        driver.findElement(SearchIcon).click();
    }

    public void ClickFirstSearchResult(){
        driver.findElement(SearchResultOne).click();
    }

}
