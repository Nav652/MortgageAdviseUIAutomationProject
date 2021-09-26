package com.UI_Automation.pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Form_Details {



        public static void form_details (WebDriver driver, String firstName, String lastname, String
        emailaddress, String contactnumber, String timetocall, String reason) throws InterruptedException {
                WebDriverWait wait = new WebDriverWait(driver,30);
        driver.findElement(By.id("FirstName")).sendKeys(firstName);
        driver.findElement(By.id("LastName")).sendKeys(lastname);
        driver.findElement(By.id("EmailAddress")).sendKeys(emailaddress);
        driver.findElement(By.name("PhoneNumber")).sendKeys(contactnumber);
        driver.findElement(By.name("BestTimeToCallYou")).sendKeys(timetocall);

        // Code to Handle Static Drop downs
        WebElement StaticDropdown = driver.findElement(By.id("ReasonForEnquiry"));
        // Scrolling down the page till the element is found
        JavascriptExecutor js = (JavascriptExecutor) driver;

                js.executeScript("window.scrollBy(0,350)","");

        Select dropdown = new Select(wait.until(ExpectedConditions.presenceOfElementLocated(By.id("ReasonForEnquiry"))));
        dropdown.selectByVisibleText(reason);

        System.out.println(driver.findElement(By.id("OptInEmail")).isSelected());
        driver.findElement(By.id("OptInEmail")).click();

        System.out.println(driver.findElement(By.id("OptInEmail")).isSelected());
        Thread.sleep(1000);

        }
}
