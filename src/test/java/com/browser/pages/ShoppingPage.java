package com.browser.pages;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidKeyCode;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;


public class ShoppingPage {
    private AndroidDriver<MobileElement> driver;

    public ShoppingPage(AndroidDriver<MobileElement> driver) {
        this.driver = driver;
    }

    private final By searchField = By.id("in.amazon.mShop.android.shopping:id/chrome_search_hint_view");
    private final By searchTextField = By.id("in.amazon.mShop.android.shopping:id/rs_search_src_text");
    private final By searchIcon = By.id("in.amazon.mShop.android.shopping:id/chrome_action_bar_search_icon");
    private final By clickFirstSearchResult = By.xpath("//android.widget.TextView[@text='mobile phone']");

    private final By SelectFirstItem = By.xpath("//android.widget.TextView[@index=[1]]");
    private final By UseCurrentLocation = By.id("in.amazon.mShop.android.shopping:id/loc_ux_gps_auto_detect");
    private final By AllowAccess = By.xpath("//android.widget.TextView[@text='Allow access']");
    private final By WhileUsingTheApp = By.id("com.android.permissioncontroller:id/permission_allow_foreground_only_button");


    public void searchProduct(String product) throws InterruptedException {
        Thread.sleep(3000);
        driver.findElement(searchField).click();
        driver.findElement(searchTextField).sendKeys(product);
        Thread.sleep(3000);
        driver.findElement(clickFirstSearchResult).click();
        Thread.sleep(3000);
        driver.findElement(SelectFirstItem).click();
        driver.findElement(UseCurrentLocation).click();
        driver.findElement(AllowAccess).click();
        driver.findElement(WhileUsingTheApp).click();

    }

}
