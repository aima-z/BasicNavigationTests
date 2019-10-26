package com.cbt.utilities;

import org.openqa.selenium.WebDriver;

import java.util.Arrays;
import java.util.List;

public class TitleVerification2 {

    public static void main(String[] args) {
        List<String> urls = Arrays.asList("https://luluandgeorgia.com", "https://wayfair.com/", "https://walmart.com" , "https://westelm.com/");

        WebDriver driver=BrowserFactory.getDriver("chrome");

        driver.get(urls.get(0));
        String title1=driver.getTitle().replace(" ", "");
        if (title1.equalsIgnoreCase("luluandgeorgia")) {
            System.out.println("test passed: Title is "+title1);
        } else {
            System.out.println("test failed: Title is different");
        }

        driver.get(urls.get(1));
        String title2=driver.getTitle().replace(" ", "");
        if (title2.equalsIgnoreCase("wayfair")) {
            System.out.println("test passed: Title is "+title2);
        } else {
            System.out.println("test failed: Title is different");
        }


        driver.get(urls.get(2));
        String title3=driver.getTitle().replace(" ", "");
        if (title3.equalsIgnoreCase("walmart")) {
            System.out.println("test passed: Title is "+title3);
        } else {
            System.out.println("test failed: Title is different");
        }

        driver.get(urls.get(3));
        String title4=driver.getTitle().replace(" ", "");
        if (title4.equalsIgnoreCase("walmart")) {
            System.out.println("test passed: Title is "+title4);
        } else {
            System.out.println("test failed: Title is different");
        }

        driver.quit();












    }
}
