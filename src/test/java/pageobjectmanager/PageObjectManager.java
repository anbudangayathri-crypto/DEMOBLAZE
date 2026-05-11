//
//package pageobjectmanager;
//
//import pageobjectmodule.LoginPage;
//import pageobjectmodule.SearchProduct;
//import utility.FileReaderManager;
//
//public class PageObjectManager {
//
//    private LoginPage loginPage;
//    private FileReaderManager fileReader;
//    private static PageObjectManager pageObjectManager;
//    private SearchProduct searchProduct;
//
//    public LoginPage getLoginPage() {
//        if(loginPage == null)
//        {
//            loginPage = new LoginPage();
//        }
//        return loginPage;
//    }
//
//    public FileReaderManager getFileReader()  {
//        if(fileReader == null)
//        {
//            fileReader = new FileReaderManager();
//        }
//        return fileReader;
//    }
//    public SearchProduct searchProduct(){
//        if(searchProduct == null){
//            searchProduct = new SearchProduct();
//        }
//        return searchProduct;
//    }
//
//    public static PageObjectManager getPageObjectManager()  {
//        if(pageObjectManager == null)
//        {
//            pageObjectManager = new PageObjectManager();
//        }
//        return pageObjectManager;
//    }
//    public SearchProduct getSearchProduct() {
//        if (searchProduct == null) {
//            searchProduct = new SearchProduct();
//        }
//        return searchProduct;
//    }
//
//    public CheckOutPage getCheckOutPage() {
//        if (checkOutPage== null) {
//            checkOutPage = new CheckOutPage();
//        }
//        return checkOutPage;
//    }
//
//    public AddressPage getAddressPage() {
//        if (addressPage== null) {
//            addressPage = new AddressPage();
//        }
//        return addressPage;
//    }
//
//}


package pageobjectmanager;

import pageobjectmodule.AddressPage;
import pageobjectmodule.CheckOutPage;
import pageobjectmodule.LoginPage;
import pageobjectmodule.SearchProduct;
import utility.FileReaderManager;

public class PageObjectManager {

    private LoginPage loginPage;
    private FileReaderManager fileReader;
    private SearchProduct searchProduct;
    private CheckOutPage checkOutPage;
    private AddressPage addressPage;
    private static PageObjectManager pageObjectManager;

    public LoginPage getLoginPage() {
        if (loginPage == null) {
            loginPage = new LoginPage();
        }
        return loginPage;
    }

    public FileReaderManager getFileReader() {
        if (fileReader == null) {
            fileReader = new FileReaderManager();
        }
        return fileReader;
    }

    public static PageObjectManager getPageObjectManager() {
        if (pageObjectManager == null) {
            pageObjectManager = new PageObjectManager();
        }
        return pageObjectManager;
    }

    public SearchProduct getSearchProduct() {
        if (searchProduct == null) {
            searchProduct = new SearchProduct();
        }
        return searchProduct;
    }

    public CheckOutPage getCheckOutPage() {
        if (checkOutPage== null) {
            checkOutPage = new CheckOutPage();
        }
        return checkOutPage;
    }

    public AddressPage getAddressPage() {
        if (addressPage== null) {
            addressPage = new AddressPage();
        }
        return addressPage;
    }
}