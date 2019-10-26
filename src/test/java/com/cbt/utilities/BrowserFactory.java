package com.cbt.utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import static io.github.bonigarcia.wdm.WebDriverManager.*;

public class BrowserFactory {
    //we going to create a method that will return webdriver object
    //this method will take one parameter -String browser
    //based on the value of the browser parameter
    //method will return corresponded webdriver object
    //if browser=chrome, then return chromedriver object

    public static WebDriver getDriver(String browser){
        if(browser.equals("chrome")){
            chromedriver().setup();
            return new ChromeDriver();
        }else if(browser.equals("firefox")){
            firefoxdriver().setup();
            return new FirefoxDriver();
        }else if(browser.equals("safari")){
            WebDriver driver=new SafariDriver();
            return new SafariDriver();
        }
        return null;
    }


}