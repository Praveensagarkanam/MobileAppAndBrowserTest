package com.browser.pages;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class MainPage {
    private AndroidDriver<MobileElement> driver;

    public MainPage(AndroidDriver<MobileElement> driver) {
        this.driver = driver;
    }

    private final By chooseLanguage = By.xpath("//android.widget.ImageView[@content-desc='Select English']");
    private final By continueInEnglish = By.id("in.amazon.mShop.android.shopping:id/continue_button");
    private final By skipSignIn = By.id("in.amazon.mShop.android.shopping:id/skip_sign_in_button");


    public void selectLanguage() {
        driver.findElement(chooseLanguage).click();
        driver.findElement(continueInEnglish).click();
    }

    public void clickSkipSignIn(){
        driver.findElement(skipSignIn).click();
    }
}
