//import io.appium.java_client.MobileElement;

import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class Main {


    public static void main(String[] args) throws MalformedURLException {


        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setCapability("appium:deviceName", "emulator-5554");
        desiredCapabilities.setCapability("platformName", "android");
        desiredCapabilities.setCapability("appium:appPackage", "com.simplemobiletools.musicplayer.debug");
        desiredCapabilities.setCapability("appium:appActivity", "com.simplemobiletools.musicplayer.activities.MainActivity");
        desiredCapabilities.setCapability("appium:noReset", true);
        desiredCapabilities.setCapability("appium:ensureWebviewsHavePages", true);
        desiredCapabilities.setCapability("appium:nativeWebScreenshot", true);
        desiredCapabilities.setCapability("appium:newCommandTimeout", 3600);
        desiredCapabilities.setCapability("appium:connectHardwareKeyboard", true);

        RemoteWebDriver driver = new RemoteWebDriver(new URL("http://127.0.0.1:4723/wd/hub"), desiredCapabilities);


        //Test
        By locator = By.id("com.simplemobiletools.musicplayer.debug:id/track_frame");
        By locator2 = By.id("com.simplemobiletools.musicplayer.debug:id/activity_track_play_pause");
        WebElement el1 = driver.findElement(By.id("com.simplemobiletools.musicplayer.debug:id/artist_holder"));
        el1.click();

        // waiting up to 10 seconds until the "TrackFrame" HTML element is loaded into the DOM
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.presenceOfElementLocated(locator));
        WebElement el2 = driver.findElement(By.id("com.simplemobiletools.musicplayer.debug:id/track_frame"));
        el2.click();

        // waiting up to 10 seconds until the "Play/Pause" HTML element is loaded into the DOM
        WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait2.until(ExpectedConditions.presenceOfElementLocated(locator2));
        WebElement el3 = driver.findElement(By.id("com.simplemobiletools.musicplayer.debug:id/activity_track_play_pause"));
        el3.click();


//            .sendKeys("Selenium");
//            driver.findElement(By.name("btnK")).click();


        //EndTest

        driver.quit();


    }}

