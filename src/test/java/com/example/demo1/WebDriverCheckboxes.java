package com.example.demo1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverCheckboxes {
    @Test
    public void CheckboxTest(){

        WebDriver driver = new ChromeDriver();

        driver.get("http://www.urn.su/qa/ui/basic_test/");

        WebElement checkbox = driver.findElement(By.id("cerseiId"));
        //checkbox.click();
        Assertions.assertTrue(checkbox.isSelected());
        System.out.println("Checkbox is selected");

        driver.quit();
    }
}
