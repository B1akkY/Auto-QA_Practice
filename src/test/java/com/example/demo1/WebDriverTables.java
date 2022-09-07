package com.example.demo1;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverTables {
    @Test
    public static void main(String[] args){

        WebDriver driver = new ChromeDriver();

        driver.get("http://www.urn.su/qa/ui/basic_test/");

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        try {
            WebElement outerTable = driver.findElement(By.tagName("table"));
            WebElement innerTable = outerTable.findElement(By.tagName("table"));
            WebElement row = innerTable.findElements(By.tagName("td")).get(2);
            System.out.println(row.getText());
        } catch (NoSuchElementException e){
            e.printStackTrace();
        }
    }
}
