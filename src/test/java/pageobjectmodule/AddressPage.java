package pageobjectmodule;

import com.base.BaseClass;
import Interfaceelements.AddressInterfaceElements;
import pageobjectmanager.PageObjectManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.time.Duration;

public class AddressPage extends BaseClass implements AddressInterfaceElements {

    @FindBy(id = name_id)
    private static WebElement name;

    @FindBy(id = country_id)
    private static WebElement country;

    @FindBy(id = city_id)
    private static WebElement city;

    @FindBy(id = card_id)
    private static WebElement creditCard;

    @FindBy(id = month_id)
    private static WebElement month;

    @FindBy(id = year_id)
    private static WebElement year;

    @FindBy(xpath = purchase_xpath)
    private static WebElement purchase;

    @FindBy(xpath = message_xpath)
    private static WebElement message;

    @FindBy(xpath = ok_btn_xpath)
    private static WebElement ok;


    @FindBy(xpath = logout_xpath)
    private static WebElement logout;

    public AddressPage() {
        PageFactory.initElements(driver,this);
    }

    public static void addressPage() throws InterruptedException{
        passInput(name, PageObjectManager.getPageObjectManager().getFileReader().getDataProperty("name"));
        passInput(country,PageObjectManager.getPageObjectManager().getFileReader().getDataProperty("country"));
        passInput(city,PageObjectManager.getPageObjectManager().getFileReader().getDataProperty("city"));
        passInput(creditCard,PageObjectManager.getPageObjectManager().getFileReader().getDataProperty("creditCard"));
        passInput(month,PageObjectManager.getPageObjectManager().getFileReader().getDataProperty("month"));
        passInput(year,PageObjectManager.getPageObjectManager().getFileReader().getDataProperty("year"));
        clickOnElement(purchase);
        Thread.sleep(2000);
        getText(message);
        clickOnElement(ok);
        Thread.sleep(2000);
        clickOnElement(logout);
    }
}