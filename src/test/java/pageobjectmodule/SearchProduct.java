package pageobjectmodule;

import Interfaceelements.SearchProductInterfaceElements;
import com.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import java.time.Duration;

public class SearchProduct extends BaseClass implements SearchProductInterfaceElements {
    @FindBy(xpath = laptop_xpath)
    private static WebElement laptop;
    @FindBy(xpath = sony_xpath)
    private static WebElement sony;
    @FindBy(xpath = cart_xpath)
    private static WebElement cart;

    public SearchProduct(){
        PageFactory.initElements(driver, this);
    }
    public static void validSearch() throws InterruptedException{
        clickOnElement(laptop);
        Thread.sleep(2000);
        clickOnElement(sony);
        Thread.sleep(2000);
        clickOnElement(cart);
        Thread.sleep(4000);
        alertAction("accept");
  }

}
