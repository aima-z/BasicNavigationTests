package com.cbt.tests;

import com.cbt.utilities.BrowserFactory;
import org.openqa.selenium.WebDriver;

public class TestCase {
    public static void main(String[] args) {
        WebDriver driver = BrowserFactory.getDriver("chrome");
        driver.get("https://google.com");
        String title=driver.getTitle();
        driver.navigate().to("https://etsy.com");
        String title2=driver.getTitle();
        driver.navigate().back();
        if(driver.getTitle().equals(title)){
            System.out.println("Test passed: titles match");
        }else{
            System.out.println("Test failed: titles do not match");
        }
        driver.navigate().forward();
        if(driver.getTitle().equals(title2)){
            System.out.println("Test passed: titles match");
        }else{
            System.out.println("Test failed: titles do not match");
        }
        driver.close();

    }

    }




