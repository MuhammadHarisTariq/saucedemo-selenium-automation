package com.automation_exercise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cart_Automation {

    // TestCase #11 //

    public static void Verify_Product_In_Cart() {
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();

        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");

        driver.findElement(By.id("login-button")).click();

        driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();

        driver.findElement(By.className("shopping_cart_link")).click();

        String product_name = driver.findElement(By.className("inventory_item_name")).getText();

        if (product_name.equals("Sauce Labs Backpack")) {
            System.out.println("TC_11 PASS: Product is available in cart");
        } else {
            System.out.println("TC_11 FAIL: Product is not available in cart");
        }

        driver.quit();
    }
    // Test Case #12 //

    public static void Verify_Product_Price_In_cart() {

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();

        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");

        driver.findElement(By.id("login-button")).click();

        driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();

        driver.findElement(By.className("shopping_cart_link")).click();

        String product_price = driver.findElement(By.className("inventory_item_price")).getText();

        if (product_price.contains("29.99")) {
            System.out.println("TC_12 PASS: Product price is correct in cart");
        }

        else {
            System.out.println("TC_12 FAIL: Product price is incorrect in cart");
        }

        driver.quit();

        // Test Case #13 //

    }

    public static void Verify_Cart_Count() {

        WebDriver driver = new ChromeDriver();

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

        String cartCount = driver
                .findElement(By.className("shopping_cart_badge"))
                .getText();

        if (cartCount.equals("1")) {
            System.out.println("TC_13 PASS: Cart count is correct");
        } else {
            System.out.println("TC_13 FAIL: Cart count is incorrect");
        }

        driver.quit();
    }

    // Test Case #14 //

    public static void Remove_Productfrom_Cart() {

        WebDriver driver = new ChromeDriver();

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

        driver.findElement(By.className("shopping_cart_link")).click();

        driver.findElement(By.id("remove-sauce-labs-backpack")).click();

        boolean productRemoved = driver
                .findElements(By.className("inventory_item_name"))
                .isEmpty();

        if (productRemoved) {
            System.out.println("TC_14 PASS: Product removed from cart");
        } else {
            System.out.println("TC_14 FAIL: Product was not removed");
        }

        driver.quit();

    }

    // TestCase #15 //

    public static void Add_Multiple_Products_To_Cart() {
        WebDriver driver = new ChromeDriver();

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

        String cartCount = driver
                .findElement(By.className("shopping_cart_badge"))
                .getText();

        if (cartCount.equals("2")) {
            System.out.println("TC_15 PASS: Multiple products added to cart");

        } else {
            System.out.println("TC_15 FAIL: Multiple products were not added");
        }

        driver.quit();
    }

}