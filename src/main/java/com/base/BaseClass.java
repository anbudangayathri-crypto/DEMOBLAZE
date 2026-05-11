package com.base;

import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;

import java.io.File;
import java.time.Duration;
import java.util.Date;


public class BaseClass {

    public static WebDriver driver;

    protected static WebDriver launchBrowser(String browserName) {
        try {
            if (browserName.equalsIgnoreCase("chrome")) {
                driver = new ChromeDriver();
            } else if (browserName.equalsIgnoreCase("firefox")) {
                driver = new FirefoxDriver();
            } else if (browserName.equalsIgnoreCase("edge")) {
                driver = new EdgeDriver();
            }
        } catch (Exception e) {
            Assert.fail("ERROR : OCCUR DURING BROWSER LAUNCH");
        }
        driver.manage().window().maximize();
        return driver;
    }

    protected static void launchUrl(String url) {
        try {
            driver.get(url);
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail("ERROR: OCCUR DURING URL LAUNCH");
        }
    }

    protected static void passInput(WebElement element, String value) {
        try {
            element.sendKeys(value);
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        } catch (Exception e) {
            Assert.fail("ERROR: OCCUR WHILE PASSING VALUE");
        }
    }

    protected static void clickOnElement(WebElement search) {
        try {
            search.click();
        } catch (Exception e) {
            Assert.fail("ERROR: OCCUR WHILE CLICKING");
        }
    }

    protected static void navigateTo(String url) {
        try {
            driver.navigate().to(url);

        } catch (Exception e) {
            Assert.fail("ERROR OCCUR DURING THE NAVIGATION OTHER URL");
        }
    }

    protected static void navigateAction(String action) {

        try {
            if (action.equalsIgnoreCase("back")) {
                driver.navigate().back();

            } else if (action.equalsIgnoreCase("forward")) {
                driver.navigate().forward();

            } else if (action.equalsIgnoreCase("refresh")) {
                driver.navigate().refresh();
            }

        } catch (Exception e) {

            Assert.fail("ERROR OCCUR DURING NAVIGATING ACTION ");

        }

    }

    protected static void promptAlert(String action, String value) {

        try {
            Alert alert = driver.switchTo().alert();
            String text1 = alert.getText();
            System.out.println(text1);
            alert.accept();
            alert.sendKeys("Gayathri");
        } catch (Exception e) {
            Assert.fail("ERROR: OCCUR DURING ALERTS");

        }
    }

    protected static void getTitle() {
        try {
            String title = driver.getTitle();
            System.out.println(title);

        } catch (Exception e) {

            Assert.fail("ERROR: OCCUR GETTING TITLE");
        }
    }

    protected static void getCurrentUrl() {
        try {
            String currentUrl = driver.getCurrentUrl();
            System.out.println(currentUrl);

        } catch (Exception e) {

            Assert.fail("ERROR: OCCUR WHEN GETTING THE CURRENT URL");
        }
    }

    protected static void urlTermination() {
        try {
            driver.quit();
        } catch (Exception e) {
            Assert.fail("ERROR: OCCUR WHILE TERMINATING THE URL");

        }
    }

    protected static void getText(WebElement element) {
        try {
            String text = element.getText();
            System.out.println(text);

        } catch (Exception e) {

            Assert.fail("ERROR: OCCUR DURING GETTING THE TEXT");
        }
    }

    protected static void screenshort(String location) {

        try {
            Date currentDate = new Date();
            System.out.println(currentDate);
            String dateFile = currentDate.toString().replace(" ", "_").replace(":", "_");
            System.out.println(dateFile);

            File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            FileHandler.copy(screenshot, new File(location + dateFile + ".png"));

        } catch (Exception e) {
            Assert.fail("ERROR: OCCUR DURING SCREENSHORT");
        }
    }

    protected static void frmAction(String id) {
        try {
            driver.switchTo().frame(id);
        } catch (Exception e) {
            Assert.fail("ERROR: OCCUR WHEN SWITCHING TO FRAME");

        }
    }

    protected static void acceptAlert() {
        Alert alert = driver.switchTo().alert();
        try {
            alert.accept();
        } catch (Exception e) {
            Assert.fail("ERROR OCCUR DURING ALERT ACCEPTED");
        }
    }

    protected static void dismissAlert() {
        Alert alert = driver.switchTo().alert();
        try {
            alert.dismiss();
        } catch (Exception e) {
            Assert.fail("ERROR OCCUR DURING ALERT DISMISSED");
        }
    }

//    protected static void alertValue(String value){
//        Alert alert=driver.switchTo().alert();
//        try{
//            alert.accept();
//            String text = alert.getText();
//            System.out.println(text);
//
//        } catch (Exception e) {
//            Assert.fail("ERROR OCCUR DURING ALERT DISMISSED");
//        }}

    protected static void alertAction(String action) {
        try {
            Alert alert = driver.switchTo().alert();
            if (action.equalsIgnoreCase("accept")) {
                alert.accept();
            } else if (action.equalsIgnoreCase("dismiss")) {
                alert.dismiss();
            }
        } catch (RuntimeException e) {
            Assert.fail("ERROR OCCURRED DURING ALERT");
        }
    }
}
