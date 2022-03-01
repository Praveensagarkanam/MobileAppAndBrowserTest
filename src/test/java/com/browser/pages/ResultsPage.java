package com.browser.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ResultsPage {

    private final WebDriver driver;

    public ResultsPage(WebDriver driver){
        this.driver = driver;
    }

    private final By AddToCartButton =By.id("add-to-cart-button");
    private final By GoToCartButton = By.xpath("//android.view.View[@text='1']");
    private final By SubTotalText = By.xpath("//android.view.View[@text='$399.99']");

    public void ClickAddToCart() throws InterruptedException {
        Thread.sleep(2000);
        WebElement element = driver.findElement(AddToCartButton);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);",element);
        element.click();
        Thread.sleep(4000);
    }
    public void GoToCart() throws InterruptedException{
        Thread.sleep(2000);
        WebElement element = driver.findElement(GoToCartButton);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);",element);
        element.click();
        Thread.sleep(4000);

    }

    public void SubTotalText(){
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(SubTotalText));
        driver.findElement(SubTotalText).click();
    }

}
