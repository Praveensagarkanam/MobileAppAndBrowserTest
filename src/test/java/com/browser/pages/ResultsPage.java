package com.browser.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ResultsPage {

    private WebDriver driver;

    public ResultsPage(WebDriver driver){
        this.driver = driver;
    }

    private By AddToCartButton =By.id("add-to-cart-button");
    private By ProceedToCheckoutButton = By.xpath("//button[@name='proceedToRetailCheckout']");

    public void ClickAddToCart() throws InterruptedException {
        Thread.sleep(2000);
        WebElement element = driver.findElement(AddToCartButton);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);",element);
        element.click();
        Thread.sleep(4000);
    }

    public void ClickOnProceedToCheckoutButton(){
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(ProceedToCheckoutButton));
        driver.findElement(ProceedToCheckoutButton).click();
    }

}
