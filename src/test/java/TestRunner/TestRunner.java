////package TestRunner;
//
//import com.base.BaseClass;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebElement;
//import pageobjectmanager.PageObjectManager;
//
//        public class TestRunner extends BaseClass {
//
//            public static void main(String[] args) throws InterruptedException {
//
//                launchBrowser(PageObjectManager.getPageObjectManager().getFileReader().getDataProperty("browser"));
//                launchUrl(PageObjectManager.getPageObjectManager().getFileReader().getDataProperty("url"));
//                PageObjectManager.getPageObjectManager().getLoginPage().validLogin();
//                Thread.sleep(2000);
//
//            }
//        }


package com.runner;

import com.base.BaseClass;
import pageobjectmanager.PageObjectManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import javax.lang.model.element.Element;
import java.time.Duration;

public class TestRunner extends BaseClass {
    public static void main(String[] args) throws InterruptedException {
        launchBrowser(PageObjectManager.getPageObjectManager().getFileReader().getDataProperty("browser"));
        launchUrl(PageObjectManager.getPageObjectManager().getFileReader().getDataProperty("url"));
        PageObjectManager.getPageObjectManager().getLoginPage().validLogin();
        Thread.sleep(2000);
        //screenshot(PageObjectManager.getPageObjectManager().getFileReader().getDataProperty("screenshot"));
        PageObjectManager.getPageObjectManager().getSearchProduct().validSearch();
        PageObjectManager.getPageObjectManager().getCheckOutPage().checkOutpage();
        Thread.sleep(4000);
//        screenshort(PageObjectManager.getPageObjectManager().getFileReader().getDataProperty("Screenshot"));
        PageObjectManager.getPageObjectManager().getAddressPage().addressPage();

    }
}
