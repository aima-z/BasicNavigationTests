package com.cbt.tests;

import com.cbt.utilities.BrowserFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;

public class NavigationTests {

    public static void main(String[] args) {

        WebDriver driver = BrowserFactory.getDriver("chrome");
        driver.get("http://facebook.com");
        String actual = driver.getCurrentUrl();
        String expected = "http://facebook.com";

        if (actual.equals(expected)) {
            System.out.println("pass");
        } else {
            System.out.println("fail");
            System.out.println("actual: " + actual);
            System.out.println("expected: " + expected);
        }
        driver.close();



    WebDriver driver1 = BrowserFactory.getDriver("firefox");
            driver1.get("http://facebook.com");
    String actual1 = driver1.getCurrentUrl();
    String expected1 = "http://facebook.com";

            if(actual1.equals(expected1)){
        System.out.println("pass");
    }else{
        System.out.println("fail");
        System.out.println("actual: " + actual1);
        System.out.println("expected: " + expected1);
    }
    driver1.close();


            WebDriver driver2=new SafariDriver();
            driver2.get("http://facebook.com");
            String actual2=driver2.getCurrentUrl();
            String expected2="http://facebook.com";

            if(actual2.equals(expected2)){
                System.out.println("pass");
            }else {
                System.out.println("fail");
                System.out.println("actual: "+actual2);
                System.out.println("expected: "+expected2);
            }
driver2.close();
        }
        }