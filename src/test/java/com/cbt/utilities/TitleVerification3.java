package com.cbt.utilities;

import org.openqa.selenium.WebDriver;

import java.util.Arrays;
import java.util.List;

public class TitleVerification3 {

    public static void main(String[] args) {
        List<String> urls = Arrays.asList("https://luluandgeorgia.com", "https://wayfair.com/", "https://walmart.com" , "https://westelm.com/");

        WebDriver driver=BrowserFactory.getDriver("chrome");
        driver.get(urls.get(0));
        String title=driver.getTitle().replace(" ", "");
        if (title.equalsIgnoreCase("luluandgeorgia")) {
            System.out.println("test passed: Title is "+title);
        } else {
            System.out.println("test failed: Title is different");
        }
        driver.close();


        WebDriver driver1=BrowserFactory.getDriver("chrome");
        driver1.get(urls.get(1));
        String title1=driver1.getTitle().replace(" ", "");
        if (title1.equalsIgnoreCase("wayfair")) {
            System.out.println("test passed: Title is "+title1);
        } else {
            System.out.println("test failed: Title is different");
        }
        driver1.close();

        WebDriver driver2=BrowserFactory.getDriver("chrome");
        driver2.get(urls.get(2));
        String title2=driver2.getTitle().replace(" ", "");
        if (title2.equalsIgnoreCase("walmart")) {
            System.out.println("test passed: Title is "+title2);
        } else {
            System.out.println("test failed: Title is different");
        }
        driver2.close();

        WebDriver driver3=BrowserFactory.getDriver("chrome");
        driver3.get(urls.get(3));
        String title3=driver3.getTitle().replace(" ", "");
        if (title3.equalsIgnoreCase("walmart")) {
            System.out.println("test passed: Title is "+title3);
        } else {
            System.out.println("test failed: Title is different");
        }
        driver3.close();


    }
}


