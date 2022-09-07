package com.example.demo1;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class WebDriverSelectItems {
    @Test
    public static void main(String[] args){

        WebDriver driver = new ChromeDriver();

        driver.get("http://www.urn.su/qa/ui/basic_test/");

        WebElement selectElement = driver.findElement(By.id("swords"));
        Select select = new Select(selectElement);
        select.selectByVisibleText("Dawn");
    }
}
