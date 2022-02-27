package com.browser.pages;

import io.netty.util.Timeout;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {

    private WebDriver driver;

    public HomePage(WebDriver driver){
        this.driver = driver;
    }

    private By SearchBarField = By.xpath("//input[@name='k']");
    private By SearchIcon = By.xpath("//input[@value='Go']");
    private By SearchResultOne =By.xpath("(//span[1]/a/div[1]/h2/span)[1]");


    public void SetValueInSearchField(String value){
        driver.findElement(SearchBarField).sendKeys(value);
    }

    public void ClickGoButton(){
        driver.findElement(SearchIcon).click();
    }

    public void ClickFirstSearchResult() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(SearchResultOne));
        driver.findElement(SearchResultOne).click();
    }

}
