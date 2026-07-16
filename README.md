# SauceDemo Web Automation Project 

A comprehensive automated web testing project for the **SauceDemo** e-commerce platform. This project demonstrates how to automate essential end-to-end user journeys and validate critical functionalities using **Selenium WebDriver** and **Core Java**.

---

## 🛠️ Tech Stack & Tools
* **Language:** Java (JDK 11 or higher)
* **Automation Tool:** Selenium WebDriver (v4.x)
* **Browser:** Google Chrome (ChromeDriver)
* **IDE:** VS Code / IntelliJ IDEA / Eclipse

---

## 🔍 Key Automated Features & Test Cases

This suite automates 20 distinct scenarios covering the entire e-commerce flow:

### 1. Authentication & Security (TC_01 - TC_05)
* Valid login testing with standard user credentials.
* Negative testing with invalid usernames, invalid passwords, empty usernames, and empty password fields to verify error handling.

### 2. Product Page Validation (TC_06 - TC_10)
* Verifying successful redirection to the products page.
* Validating item displays, accurate product names, and pricing consistency.
* Testing basic functional flow for adding single items to the cart.

### 3. Cart Management (TC_11 - TC_15)
* Verifying selected products successfully reflect inside the cart.
* Validating cart totals, real-time item count badges, and item removal mechanics.
* Testing workflows for adding multiple items concurrently.

### 4. Checkout Journey & Form Validation (TC_16 - TC_20)
* Simulating checkout steps with fully valid user information.
* Boundary testing for form validations (verifying appropriate error prompts when **First Name**, **Last Name**, or **Postal Code** fields are left empty).
* Finalizing the user journey with successful order dispatch confirmation.

---

## ⚙️ Core QA Concepts Applied
* **Dynamic Synchronizations:** Implemented Explicit Waits (`WebDriverWait`) to intelligently handle dynamic element rendering and avoid flaky executions.
* **Locating Mechanisms:** Utilized structured locators including IDs, Class Names, XPath, and CSS Selectors for robust element identification.
* **Test Metrics:** Built custom console execution tracking logs for clear pass/fail status monitoring.

---

## How to Set Up and Run the Project Locally

Follow these step-by-step instructions to set up and execute the automation suite on your local machine:

### 1. Prerequisites
* **Java Development Kit (JDK):** Ensure JDK 11 or higher is installed. You can check by running `java -version` in your terminal.
* **Google Chrome:** Make sure your Google Chrome browser is updated.
* **IDE Extension:** If using VS Code, install the **Extension Pack for Java**.

### 2. Download Selenium Dependencies
Since this project manually manages dependencies:
1. Go to the [Selenium Downloads](https://www.selenium.dev/downloads/) page.
2. Download the **Selenium Java** library zip file and extract (unzip) it.
3. Keep the extracted folder handy, as you will need the `.jar` files inside it and the `lib` folder.

### 3. Clone and Open the Project
1. Clone this repository using terminal:
   ```bash
   git clone https://github.com/MuhammadHarisTariq/saucedemo-selenium-automation.git
