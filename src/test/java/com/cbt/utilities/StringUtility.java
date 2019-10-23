package com.cbt.utilities;

import org.openqa.selenium.WebDriver;

public class StringUtility {

    public static void main(String[] args) {

        WebDriver driver=BrowserFactory.getDriver("chrome");
driver.get("http://facebook.com");
String actual=driver.getCurrentUrl();
String expected="http://facebook.com";

if(actual.equals(expected)){
    System.out.println("pass");
}else {
    System.out.println("fail");
    System.out.println("actual: "+actual);
    System.out.println("expected: "+expected);
}

    }
}
