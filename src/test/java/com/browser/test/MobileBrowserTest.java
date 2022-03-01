package com.browser.test;

import com.browser.pages.HomePage;
import com.browser.pages.ResultsPage;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class MobileBrowserTest {

    WebDriver driver;
    @BeforeTest
    public void launchChromeBrowserInMobile() throws MalformedURLException {
        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability(MobileCapabilityType.DEVICE_NAME, "diq4mje6pfemeexg");
        cap.setCapability(MobileCapabilityType.PLATFORM_NAME, MobilePlatform.ANDROID);
        cap.setCapability(MobileCapabilityType.BROWSER_NAME, "Chrome");
        driver = new AppiumDriver(new URL("http://127.0.0.1:4723/wd/hub"),cap);
    }

    @Test
    public void launchBrowser() throws InterruptedException {
        driver.get("https://www.amazon.com/");
        //Search for Value:
        HomePage homePage = new HomePage(driver);
        ResultsPage resultsPage = new ResultsPage(driver);
        homePage.SetValueInSearchField("Mobile Phone");
        homePage.ClickGoButton();
        homePage.ClickFirstSearchResult();
        resultsPage.ClickAddToCart();
        resultsPage.SubTotalText();
    }

    @AfterTest
    public void closeBrowser() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();
    }
}
