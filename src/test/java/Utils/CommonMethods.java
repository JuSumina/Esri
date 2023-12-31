package Utils;

import StepDefinitions.PageInitializer;
import org.apache.commons.io.FileUtils;
import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

import static StepDefinitions.PageInitializer.initializePageObjects;
import static StepDefinitions.PageInitializer.login;


public class CommonMethods extends PageInitializer {

    public static WebDriver driver;

    public static void openBrowserAndLaunchApplication(){

        ConfigReader.readProperties();

        String browserType=ConfigReader.getPropertyValue("browserType");

        switch (browserType) {
            case"Chrome":
                driver = new ChromeDriver();
                break;
            case "Firefox":
                driver = new FirefoxDriver();
                break;
            case "IE":
                driver = new InternetExplorerDriver();
                break;
            default:
                driver = new EdgeDriver();
                break;
        }

        //driver.manage().window().maximize();

        driver.get(ConfigReader.getPropertyValue("url"));
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(Constants.WAIT_TIME));
        initializePageObjects();

    }

    /*public static void LogIntoApplication() {
        login.signInBtnMain.click();
        sendText(login.usernameTextBox, ConfigReader.getPropertyValue("username"));
        sendText(login.passwordTextBox, ConfigReader.getPropertyValue("password"));
        login.signInBtn.click();

    }*/

    public static void closeBrowser () {
        driver.close();
    }

    public static void doClick(WebElement element) {

        element.click();
    }

    public static void sendText(WebElement element, String text) {
        element.clear();
        element.sendKeys(text);
    }

        public static byte[] takeScreenshot(String imageName) {
            // This casts the webDriver instance 'driver' to TakeScreenshot Interface
            TakesScreenshot ts = (TakesScreenshot) driver;

            // This captures the screenshot and stores it as byte array
            byte[] picBytes = ts.getScreenshotAs(OutputType.BYTES);

            // This captures the screenshot and stores it as a file in the sourceFile variable
            File sourcePath = ts.getScreenshotAs(OutputType.FILE);

            try {
                FileUtils.copyFile(sourcePath, new File(Constants.SCREENSHOT_FILEPATH + imageName + getTimeStamp("yyyy-MM-dd-HH-mm-ss") + ".png"));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            return picBytes;
        }

        public static String getTimeStamp(String pattern) {
            Date date = new Date();
            SimpleDateFormat sdf = new SimpleDateFormat(pattern);
            return sdf.format(date);

    }

}
