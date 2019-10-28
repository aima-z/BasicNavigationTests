package com.cbt.utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.safari.SafariDriver;

import static io.github.bonigarcia.wdm.WebDriverManager.chromedriver;
import static io.github.bonigarcia.wdm.WebDriverManager.firefoxdriver;

public class BrowserFactory {


    public static WebDriver getDriver(String browser) {

        System.out.println(System.getProperty("os.name"));

        if (System.getProperty("os.name").contains("Mac")) {

            if (browser.equals("edge")) {
                return null;
            }
            if (browser.equals("chrome")) {
                chromedriver().setup();
                return new ChromeDriver();
            } else if (browser.equals("firefox")) {
                firefoxdriver().setup();
                return new FirefoxDriver();
            } else if (browser.equals("internet explorer")) {
                WebDriver driver = new InternetExplorerDriver();
                return new InternetExplorerDriver();
            } else if (browser.equals("opera")) {
                WebDriver driver = new OperaDriver();
                return new OperaDriver();
            } else if (browser.equals("safari")) {
                WebDriver driver = new SafariDriver();
                return new SafariDriver();
            }

        } else if (System.getProperty("os.name").contains("Windows")) {
            if (browser.equals("safari")) {
                return null;
            }
            if (browser.equals("chrome")) {
                chromedriver().setup();
                return new ChromeDriver();
            } else if (browser.equals("firefox")) {
                firefoxdriver().setup();
                return new FirefoxDriver();
            } else if (browser.equals("edge")) {
                WebDriver driver = new EdgeDriver();
                return new EdgeDriver();
            } else if (browser.equals("internet explorer")) {
                WebDriver driver = new InternetExplorerDriver();
                return new InternetExplorerDriver();
            } else if (browser.equals("opera")) {
                WebDriver driver = new OperaDriver();
                return new OperaDriver();
            }
            }

        return null;
    }
}
//we going to create a method that will return webdriver object
//this method will take one parameter -String browser
//based on the value of the browser parameter
//method will return corresponded webdriver object
//if browser=chrome, then return chromedriver object


