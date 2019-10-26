package com.cbt.utilities;

import org.openqa.selenium.WebDriver;

import java.util.Arrays;
import java.util.List;

public class TitleVerification {
    public static void main(String[] args) throws InterruptedException {
        List<String> urls = Arrays.asList("http://practice.cybertekschool.com/", "http://practice.cybertekschool.com/dropdown", "http://practice.cybertekschool.com/login");

        WebDriver driver =BrowserFactory.getDriver("chrome");

        driver.get(urls.get(0));
        BrowserUtils.wait(3);
        boolean url1 = driver.getCurrentUrl().startsWith("http://practice.cybertekschool.com");
        String title1=driver.getTitle();
        driver.get(urls.get(1));
        BrowserUtils.wait(3);
        boolean url2=driver.getCurrentUrl().startsWith("http://practice.cybertekschool.com");
        String title2=driver.getTitle();
        driver.get(urls.get(2));
        BrowserUtils.wait(3);
        boolean url3=driver.getCurrentUrl().startsWith("http://practice.cybertekschool.com");
        String title3=driver.getTitle();

        if (title1.equals(title2) && title1.equals(title3)){
            System.out.println("Test passed: titles are same");
        }else{
            System.out.println("Test failed: titles are not same");
        }

if(url1){
    System.out.println("Test passed: url1 starts with \"http://practice.cybertekschool.com\"");
}else{
    System.out.println("Test failed: url1 does not start with \"http://practice.cybertekschool.com\"");
}

        if(url2){
            System.out.println("Test passed: url2 starts with \"http://practice.cybertekschool.com\"");
        }else{
            System.out.println("Test failed: url2 does not start with \"http://practice.cybertekschool.com\"");
        }

        if(url3){
            System.out.println("Test passed: url3 starts with \"http://practice.cybertekschool.com\"");
        }else{
            System.out.println("Test failed: url3 does not start with \"http://practice.cybertekschool.com\"");
        }








driver.close();
    }
}
