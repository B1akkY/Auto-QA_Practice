package com.example.demo1;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;

public class WebDriverRadioButtons {
    @Test
    public static void main(String[] args){

        WebDriver driver = new ChromeDriver();

        driver.get("http://www.urn.su/qa/ui/basic_test/");

        List<WebElement> radioButtons = driver.findElements(By.name("house"));
        radioButtons.get(1).click();

        for(WebElement radioButton: radioButtons){

            if(radioButton.isSelected()){
                System.out.println(radioButton.getAttribute("value"));
            }
        }
    }
}
