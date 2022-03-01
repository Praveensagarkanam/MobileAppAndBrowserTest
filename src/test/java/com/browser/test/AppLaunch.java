package com.browser.test;

import com.browser.pages.MainPage;
import com.browser.pages.ShoppingPage;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class AppLaunch {

    AndroidDriver<MobileElement> driver;
    private final static String APP_PACKAGE_NAME ="in.amazon.mShop.android.shopping";
    private final static String APP_ACTIVITY_NAME ="com.amazon.windowshop.home.HomeLauncherActivity";
    private MainPage mainPage;
    private ShoppingPage shoppingPage;
    @BeforeTest
    public void launchAppInMobile() throws MalformedURLException {
        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability(MobileCapabilityType.PLATFORM_NAME, MobilePlatform.ANDROID);
        cap.setCapability(MobileCapabilityType.UDID, "diq4mje6pfemeexg");
        cap.setCapability(AndroidMobileCapabilityType.APP_PACKAGE,APP_PACKAGE_NAME);
        cap.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, APP_ACTIVITY_NAME);
        driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"),cap);
    }

    @Test
    public void AddProductToCart() throws InterruptedException {
        Thread.sleep(5000);
        System.out.println("App launched");
        mainPage = new MainPage(driver);
        shoppingPage = new ShoppingPage(driver);
        mainPage.selectLanguage();
        mainPage.clickSkipSignIn();
        shoppingPage.searchProduct("Mobile Phone");
    }

    @AfterTest
    public void closeApp() throws InterruptedException {
        Thread.sleep(4000);
        driver.quit();
    }
}
