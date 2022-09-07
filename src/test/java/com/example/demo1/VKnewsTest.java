package com.example.demo1;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VKnewsTest {
    @Test
    public static void main(String[] args){

        WebDriver driver = new ChromeDriver();

        driver.get("https://vk.com/login?to=");

        WebElement VKid = driver.findElement(By.id("index_email"));
        VKid.click();
        VKid.sendKeys("89150325300");

        try{
            Thread.sleep(2000);
        } catch (Exception e){
            e.printStackTrace();
        }
        WebElement login = driver.findElement(By.xpath("//*[@id=\"content\"]/div[1]/form/button[1]"));
        login.click();

        try{
            Thread.sleep(2000);
        } catch (Exception e) {
            e.printStackTrace();
        }

        WebElement password = driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[2]/div/form/div[1]/div[3]/div[2]/div[1]/div/input"));
        password.click();
        password.sendKeys("604375B1ackY");

    }
}
