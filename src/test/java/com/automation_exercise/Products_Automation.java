package com.automation_exercise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Products_Automation {

    // TestCase #06 //

    public static void Verify_Product_Page() {

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();

        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");

        driver.findElement(By.id("login-button")).click();
        

        String PageTitle = driver.findElement(By.cssSelector(".title")).getText();

        if (PageTitle.contains("Products")) {
            System.out.println("TC_06 PASS: Products page is displayed");
        } else {
            System.out.println("TC_06 FAIL: Products page is not displayed");

        }

        driver.quit();

    }

    // TestCase #07 //

    public static void Verify_Product_Display() {
        WebDriver driver1 = new ChromeDriver();

        driver1.get("https://www.saucedemo.com/");
        driver1.manage().window().maximize();
        driver1.findElement(By.id("user-name")).sendKeys("standard_user");
        driver1.findElement(By.id("password")).sendKeys("secret_sauce");
        driver1.findElement(By.id("login-button")).click();

        int product_count = driver1.findElements(By.className("inventory_item")).size();

        if (product_count > 0) {

            System.out.println("TC_07 PASS: Products are displayed");

        } else {
            System.out.println("TC_07 FAIL: Products are not displayed");
        }

        driver1.quit();
    }

    // TestCase #08 //

    public static void Verify_Product_Name() {
        WebDriver driver2 = new ChromeDriver();

        driver2.get("https://www.saucedemo.com/");
        driver2.manage().window().maximize();
        driver2.findElement(By.id("user-name")).sendKeys("standard_user");
        driver2.findElement(By.id("password")).sendKeys("secret_sauce");

        driver2.findElement(By.id("login-button")).click();

        String Product_name = driver2.findElement(By.cssSelector(".inventory_item_name")).getText();

        if (Product_name.contains("Sauce Labs Backpack")) {

            System.out.println("TC_08 PASS: Product name is displayed correctly");

        }

        else {
            System.out.println("TC_08 Fail: Product name is not displayed correctly");

        }

        driver2.quit();
    }

    // TestCase #09 //

    public static void Verify_Product_Price() {

        WebDriver driver3 = new ChromeDriver();
        driver3.get("https://www.saucedemo.com/");
        driver3.manage().window().maximize();

        driver3.findElement(By.id("user-name")).sendKeys("standard_user");
        driver3.findElement(By.id("password")).sendKeys("secret_sauce");

        driver3.findElement(By.id("login-button")).click();

        String product_price = driver3.findElement(By.className("inventory_item_price")).getText();

        if (product_price.contains("29.99")) {
            System.out.println("TC_09 PASS: Product price is correct");

        } else {
            System.out.println("TC_09 FAIL: Product price is not correct");
        }

        driver3.quit();

    }

    // TestCase #10 //

    public static void Add_Product_to_Cart() {
        WebDriver driver4 = new ChromeDriver();
        driver4.get("https://www.saucedemo.com/");
        driver4.manage().window().maximize();
        driver4.findElement(By.id("user-name")).sendKeys("standard_user");
        driver4.findElement(By.id("password")).sendKeys("secret_sauce");

        driver4.findElement(By.id("login-button")).click();

        driver4.findElement(By.cssSelector("#add-to-cart-sauce-labs-backpack")).click();

        String Cart_count = driver4.findElement(By.cssSelector("#shopping_cart_container > a > span")).getText();

        if (Cart_count.equals("1")) {
            System.out.println("TC_10 PASS: Product added to cart");
        } else {
            System.out.println("TC_10 FAIL: Product was not added to cart");
        }

        driver4.quit();

    }

}
