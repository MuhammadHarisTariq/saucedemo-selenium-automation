package com.automation_exercise;

public class App {

    static int totalTests = 0;
    static int passedTests = 0;
    static int failedTests = 0;

    public static void main(String[] args) {

        System.out.println("======================================================");
        System.out.println("        SAUCEDEMO AUTOMATION TEST EXECUTION REPORT");
        System.out.println("======================================================");

        System.out.println("\n================ LOGIN AUTOMATION ===================");

        runTest("TC_01", "Valid Login",
                Login_Automation::Valid_Login);

        runTest("TC_02", "Invalid Username",
                Login_Automation::Invalid_Username);

        runTest("TC_03", "Invalid Password",
                Login_Automation::Invalid_Password);

        runTest("TC_04", "Empty Username",
                Login_Automation::Empty_Username);

        runTest("TC_05", "Empty Password",
                Login_Automation::Empty_Password);

        System.out.println("\n================ PRODUCTS AUTOMATION ===============");

        runTest("TC_06", "Verify Product Page",
                Products_Automation::Verify_Product_Page);

        runTest("TC_07", "Verify Product Display",
                Products_Automation::Verify_Product_Display);

        runTest("TC_08", "Verify Product Name",
                Products_Automation::Verify_Product_Name);

        runTest("TC_09", "Verify Product Price",
                Products_Automation::Verify_Product_Price);

        runTest("TC_10", "Add Product to Cart",
                Products_Automation::Add_Product_to_Cart);

        System.out.println("\n================ CART AUTOMATION ====================");

        runTest("TC_11", "Verify Product in Cart",
                Cart_Automation::Verify_Product_In_Cart);

        runTest("TC_12", "Verify Product Price in Cart",
                Cart_Automation::Verify_Product_Price_In_cart);

        runTest("TC_13", "Verify Cart Count",
                Cart_Automation::Verify_Cart_Count);

        runTest("TC_14", "Remove Product from Cart",
                Cart_Automation::Remove_Productfrom_Cart);

        runTest("TC_15", "Add Multiple Products to Cart",
                Cart_Automation::Add_Multiple_Products_To_Cart);

        System.out.println("\n================ CHECKOUT AUTOMATION ================");

        runTest("TC_16", "Checkout with Valid Information",
                Check_out_automation::CheckOut_with_Valid_information);

        runTest("TC_17", "Empty First Name",
                Check_out_automation::Empty_FirstName);

        runTest("TC_18", "Empty Last Name",
                Check_out_automation::Empty_Last_Name);

        runTest("TC_19", "Empty Postal Code",
                Check_out_automation::Empty_Postal_Code);

        runTest("TC_20", "Complete Order Successfully",
                Check_out_automation::Complete_Order_Successfully);

        System.out.println("\n======================================================");
        System.out.println("                 TEST EXECUTION SUMMARY");
        System.out.println("======================================================");

        System.out.println("Total Test Cases : " + totalTests);
        System.out.println("Passed Test Cases: " + passedTests);
        System.out.println("Failed Test Cases: " + failedTests);

        System.out.println("======================================================");
        System.out.println("           AUTOMATION EXECUTION COMPLETED");
        System.out.println("======================================================");

        if (failedTests > 0) {
            System.exit(1);
        }
    }

    public static void runTest(String testCaseID,
            String testCaseName,
            Runnable testCase) {

        totalTests++;

        try {

            testCase.run();

            passedTests++;

        } catch (AssertionError e) {
            failedTests++;

            System.out.println("RESULT: FAIL");
            System.out.println("TEST: " + testCaseID + " - " + testCaseName);
            System.out.println("ERROR: " + e.getMessage());

        } catch (Exception e) {
            failedTests++;

            System.out.println("RESULT: FAIL");
            System.out.println("TEST: " + testCaseID + " - " + testCaseName);
            System.out.println("ERROR: " + e.getMessage());
        }
    }
}