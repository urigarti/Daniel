package org.example;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.appmanagement.BaseOptions;
import org.openqa.selenium.By;
import org.openqa.selenium.MutableCapabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class Main {

    static WebDriver driver;

    public static void main(String[] args) throws MalformedURLException {
        setUp();
        WebElement two=driver.findElement(By.id("com.google.android.gm:id/welcome_tour_got_it"));
        two.click();

        WebElement three =driver.findElement(By.id("com.google.android.gm:id/action_done"));
        three.click();



    }

    public static void setUp() throws MalformedURLException {

        //Set up desired capabilities and pass the Android app-activity and app-package to Appium
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("automationName", "uiautomator2");
        capabilities.setCapability("deviceName","Android");
        capabilities.setCapability("platformName","Android");
        capabilities.setCapability("platformVersion","11");
        capabilities.setCapability("appPackage","com.google.android.gm");
        capabilities.setCapability("appActivity","com.google.android.gm.GmailActivity");
        capabilities.setCapability("noReset","true");


//Create RemoteWebDriver instance and connect to the Appium server
        //It will launch the Calculator App in Android Device using the configurations specified in Desired Capabilities
        driver = new AppiumDriver(new URL("http://127.0.0.1:4723/"), capabilities);
    }
}