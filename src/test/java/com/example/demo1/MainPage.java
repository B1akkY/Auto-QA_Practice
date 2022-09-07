package com.example.demo1;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class MainPage {

    WebDriver driver = new ChromeDriver();

    @BeforeEach
    public void SetUp(){
        driver.get("https://www.urn.su/qa/ui/basic_test/");

    }

    @Test
    public void MainPageTest() {

        String url = driver.getCurrentUrl();
        System.out.println(url);
        Assertions.assertTrue(url.equals("https://www.urn.su/qa/ui/basic_test/"));
        WebElement searchField = driver.findElement(By.id("name1"));

        searchField.sendKeys("topbicycle.ru");
        searchField.submit();
        System.out.println("Field is submitted successfully");
    }

    @Test
    public void RenovationTest() {


        WebElement renovationLink = driver.findElement(By.linkText("Renovation"));

        renovationLink.click();
        System.out.println("Link is clicked successfully");


    }

    @Test
    public void LinkTest() {


        WebElement march8Link = driver.findElement(By.cssSelector("a[class=march8]"));

        march8Link.click();
        System.out.println("Link is clicked successfully");

    }

    @Test
    public void TagNameTest() {

        WebElement imageLink = driver.findElement(By.tagName("img"));

        imageLink.click();
        System.out.println("Link is clicked successfully");

    }

    @AfterEach
    public void Close(){
        try{
            Thread.sleep(1000);
        }catch (Exception e){
            e.printStackTrace();
        }
        driver.quit();
    }

}
    