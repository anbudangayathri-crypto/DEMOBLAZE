//package pageobjectmodule;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.FindBy;
//import org.openqa.selenium.support.PageFactory;
//
//import java.time.Duration;
//
//import static com.base.BaseClass.driver;
//
//public class LoginPage  extends BaseClass implements LoginInterfaceElemnts {
//    @FindBy(linkText = login_linkText)
//    private static WebElement login;
//    @FindBy(id = username_id)
//    private static WebElement username;
//    @FindBy(css = password_css)
//    private static WebElement password;
//    @FindBy(xpath = signin_xpath)
//    private static WebElement xpath;
//    @FindBy(id = title_id)
//    private static WebElement title;
//
//    public LoginPage() {
//        PageFactory.initElements(driver, this);
//    }
//
//    public static void validLogin() {
//        clickOnElement(login);
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
//        passInput(username, pageObjectManager.getPageObjectManager().getFileReader().getDataProperty("username"));
//        passInput(passwoed, pageObjectManager.getPageObjectManager().getFileReader().getDataProperty("password"));
//        clickOnElement(signin);
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
//        getText(title);
//    }
//}


package pageobjectmodule;

import com.base.BaseClass;
import Interfaceelements.LoginInterfaceElements;
import pageobjectmanager.PageObjectManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.time.Duration;

public class LoginPage extends BaseClass implements LoginInterfaceElements
{
    @FindBy(linkText = login_linktext)
    private static WebElement login;

    @FindBy(id = username_id)
    private static WebElement username;

    @FindBy(css = password_css)
    private static WebElement password;

    @FindBy(xpath = signin_xpath)
    private static WebElement signin;

    @FindBy(id = title_id)
    private static WebElement title;


    public LoginPage() {

        PageFactory.initElements(driver, this);
    }

    public static void validLogin() throws InterruptedException
    {
        clickOnElement(login);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        passInput(username,PageObjectManager.getPageObjectManager().getFileReader().getDataProperty("username"));
        passInput(password,PageObjectManager.getPageObjectManager().getFileReader().getDataProperty("password"));
        clickOnElement(signin);
        Thread.sleep(2000);
        getText(title);
    }
}
