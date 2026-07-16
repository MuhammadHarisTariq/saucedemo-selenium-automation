package com.automation_exercise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions; // ---> ADDED: Import for ChromeOptions
import org.openqa.selenium.support.ui.ExpectedConditions;
import java.time.Duration;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Check_out_automation {

    // TestCase 16 //

    public static void CheckOut_with_Valid_information() {

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--guest");
        WebDriver driver = new ChromeDriver(options);

        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();

        driver.findElement(By.id("user-name"))
                .sendKeys("standard_user");

        driver.findElement(By.id("password"))
                .sendKeys("secret_sauce");

        driver.findElement(By.id("login-button"))
                .click();

        driver.findElement(By.id("add-to-cart-sauce-labs-backpack"))
                .click();

        driver.findElement(By.id("add-to-cart-sauce-labs-bike-light")).click();

        driver.findElement(By.className("shopping_cart_link")).click();

        driver.findElement(By.id("checkout")).click();

        driver.findElement(By.id("first-name")).sendKeys("Muhammad Haris Tariq");

        driver.findElement(By.id("last-name")).sendKeys("Tariq");

        driver.findElement(By.id("postal-code")).sendKeys("75010");

        driver.findElement(By.id("continue")).click();

        String PageTitle = driver.findElement(By.className("title")).getText();

        if (PageTitle.equals("Checkout: Overview")) {
            System.out.println("TC_16 PASS: Checkout with valid information");
        } else {
            System.out.println("TC_16 FAIL: Checkout with valid information");
        }

        driver.quit();

    }

    // TestCase 17 //

    public static void Empty_FirstName() {

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--guest");
        WebDriver driver = new ChromeDriver(options);

        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();

        driver.findElement(By.id("user-name"))
                .sendKeys("standard_user");

        driver.findElement(By.id("password"))
                .sendKeys("secret_sauce");

        driver.findElement(By.id("login-button"))
                .click();

        driver.findElement(By.id("add-to-cart-sauce-labs-backpack"))
                .click();

        driver.findElement(By.id("add-to-cart-sauce-labs-bike-light")).click();

        driver.findElement(By.className("shopping_cart_link")).click();

        driver.findElement(By.id("checkout")).click();

        driver.findElement(By.id("last-name")).sendKeys("Tariq");

        driver.findElement(By.id("postal-code")).sendKeys("75010");

        driver.findElement(By.id("continue")).click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

        String error_message = wait
                .until(ExpectedConditions.visibilityOfElementLocated(
                        By.cssSelector("h3[data-test='error']")))
                .getText();

        if (error_message.contains("Error: First Name is required")) {
            System.out.println("TC_17 PASS: Empty first name validation");
        } else {
            System.out.println("TC_17 FAIL: Empty first name validation");
        }

        driver.quit();

    }

    // TestCase 18 //

    public static void Empty_Last_Name() {

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--guest");
        WebDriver driver = new ChromeDriver(options);

        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();

        driver.findElement(By.id("user-name"))
                .sendKeys("standard_user");

        driver.findElement(By.id("password"))
                .sendKeys("secret_sauce");

        driver.findElement(By.id("login-button"))
                .click();

        driver.findElement(By.id("add-to-cart-sauce-labs-backpack"))
                .click();

        driver.findElement(By.className("shopping_cart_link"))
                .click();

        driver.findElement(By.id("checkout"))
                .click();

        driver.findElement(By.id("first-name"))
                .sendKeys("Muhammad Haris");

        // Last name is empty

        driver.findElement(By.id("postal-code"))
                .sendKeys("75300");

        driver.findElement(By.id("continue"))
                .click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

        String errorMessage = wait
                .until(ExpectedConditions.visibilityOfElementLocated(
                        By.cssSelector("h3[data-test='error']")))
                .getText();

        if (errorMessage.contains("Last Name is required")) {
            System.out.println("TC_18 PASS: Empty last name validation");
        } else {
            System.out.println("TC_18 FAIL: Empty last name validation");
        }

        driver.quit();
    }

    // TestCase 19 //

    public static void Empty_Postal_Code() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--guest");
        WebDriver driver = new ChromeDriver(options);

        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();

        driver.findElement(By.id("user-name"))
                .sendKeys("standard_user");

        driver.findElement(By.id("password"))
                .sendKeys("secret_sauce");

        driver.findElement(By.id("login-button"))
                .click();

        driver.findElement(By.id("add-to-cart-sauce-labs-backpack"))
                .click();

        driver.findElement(By.className("shopping_cart_link"))
                .click();

        driver.findElement(By.id("checkout"))
                .click();

        driver.findElement(By.id("first-name"))
                .sendKeys("Muhammad Haris");

        driver.findElement(By.id("last-name"))
                .sendKeys("Tariq");

        driver.findElement(By.id("continue"))
                .click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

        String errorMessage = wait
                .until(ExpectedConditions.visibilityOfElementLocated(
                        By.cssSelector("h3[data-test='error']")))
                .getText();

        if (errorMessage.contains("Postal Code is required")) {
            System.out.println("TC_19 PASS: Empty postal code validation");
        } else {
            System.out.println("TC_19 FAIL: Empty postal code validation");
        }

        driver.quit();
    }

    // TestCase 20 //

    public static void Complete_Order_Successfully() {

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--guest");
        WebDriver driver = new ChromeDriver(options);

        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();

        driver.findElement(By.id("user-name"))
                .sendKeys("standard_user");

        driver.findElement(By.id("password"))
                .sendKeys("secret_sauce");

        driver.findElement(By.id("login-button"))
                .click();

        driver.findElement(By.id("add-to-cart-sauce-labs-backpack"))
                .click();

        driver.findElement(By.id("add-to-cart-sauce-labs-bike-light")).click();

        driver.findElement(By.className("shopping_cart_link")).click();

        driver.findElement(By.id("checkout")).click();

        driver.findElement(By.id("first-name")).sendKeys("Muhammad Haris");

        driver.findElement(By.id("last-name")).sendKeys("Tariq");

        driver.findElement(By.id("postal-code")).sendKeys("75010");

        driver.findElement(By.id("continue")).click();

        driver.findElement(By.id("finish")).click();

        String Success_Message = driver.findElement(By.className("complete-header")).getText();

        if (Success_Message.equals("Thank you for your order!")) {

            System.out.println("TC_20 PASS: Order completed successfully");

        }

        else {
            System.out.println("TC_20 FAIL: Order was not completed");
        }

        driver.quit();
    }

}