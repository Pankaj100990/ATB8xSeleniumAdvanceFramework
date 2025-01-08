package com.thetestingacademy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestSelenium {
    @Test
    public void test_VWOLogin(){
        WebDriver driver=new ChromeDriver();
        driver.get("https://app.vwo.com");
        driver.quit();
    }
}
