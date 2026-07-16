package com.automation_exercise;

import org.jspecify.annotations.NonNull;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login_Automation {

    // TestCase #01 //

    public static void Valid_Login() {

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();

        @SuppressWarnings("null")
        @NonNull
        String current_url = driver.getCurrentUrl();

        if (current_url.contains("inventory")) {

            System.out.println("TC_01 PASS: Login with valid credentials");

        } else {
            System.out.println("TC_01 FAIL: Login with valid credentials");
        }

        driver.quit();

    }

    // TestCase #02 //

    public static void Invalid_Username() {

        WebDriver driver1 = new ChromeDriver();

        driver1.get("https://www.saucedemo.com/");
        driver1.manage().window().maximize();
        driver1.findElement(By.id("user-name")).sendKeys("abc");
        driver1.findElement(By.id("password")).sendKeys("secret_sauce");
        driver1.findElement(By.id("login-button")).click();

        String error_message = driver1
                .findElement(
                        By.cssSelector("#login_button_container > div > form > div.error-message-container.error > h3"))
                .getText();

        if (error_message.contains("Username and password do not match")) {
            System.out.println("TC_02 PASS: Invalid username validation");
        } else {
            System.out.println("TC_02 FAIL: Invalid username validation");
        }

        driver1.quit();

    }

    // TestCase #03 //

    public static void Invalid_Password() {

        WebDriver driver2 = new ChromeDriver();
        driver2.get("https://www.saucedemo.com/");
        driver2.manage().window().maximize();
        driver2.findElement(By.id("user-name")).sendKeys("standard_user");
        driver2.findElement(By.id("password")).sendKeys("12345");
        driver2.findElement(By.id("login-button")).click();

        String error_message = driver2
                .findElement(
                        By.cssSelector("#login_button_container > div > form > div.error-message-container.error > h3"))
                .getText();

        if (error_message.contains("Username and password do not match")) {
            System.out.println("TC_03 PASS: Invalid Password validation");
        } else {
            System.out.println("TC_03 FAIL: Invalid Password validation");
        }

        driver2.quit();

    }

    // TestCase #04 //

    public static void Empty_Username() {
        WebDriver driver3 = new ChromeDriver();
        driver3.get("https://www.saucedemo.com/");
        driver3.manage().window().maximize();
        driver3.findElement(By.id("password")).sendKeys("secret_sauce");
        driver3.findElement(By.id("login-button")).click();

        String error_message = driver3
                .findElement(
                        By.cssSelector("#login_button_container > div > form > div.error-message-container.error > h3"))
                .getText();

        if (error_message.contains("Username is required")) {
            System.out.println("TC_04 PASS: Empty username validation");
        } else {
            System.out.println("TC_04 FAIL: Empty username validation");
        }

        driver3.quit();

    }

    // TestCase #05 //

    public static void Empty_Password() {
        WebDriver driver4 = new ChromeDriver();
        driver4.get("https://www.saucedemo.com/");
        driver4.manage().window().maximize();
        driver4.findElement(By.id("user-name")).sendKeys("standard_user");
        driver4.findElement(By.id("login-button")).click();

        String error_message = driver4
                .findElement(
                        By.cssSelector("#login_button_container > div > form > div.error-message-container.error > h3"))
                .getText();

        if (error_message.contains("Password is required")) {
            System.out.println("TC_05 PASS: Empty password validation");
        } else {
            System.out.println("TC_05 FAIL: Empty password validation");
        }

        driver4.quit();

    }

}
