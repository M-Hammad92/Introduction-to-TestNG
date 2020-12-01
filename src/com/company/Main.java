package com.company;

import org.testng.annotations.*;

public class Main{

    @BeforeTest
    public void beforeTest(){
        System.out.println("Open Chrome");
    }
    @Test
    public void searchCustomer(){
        System.out.println("Search For Customer");
    }
    @Test
    public void searchProduct(){
        System.out.println("Search For Product");
    }
    @AfterTest
    public void afterTest(){
        System.out.println("Close Chrome");
    }

    @BeforeMethod
    public void beforeMethod(){
        System.out.println("Sign In");
    }
    @AfterMethod
    public void afterMethod(){
        System.out.println("Sign Out");
    }
    @BeforeClass
    public void beforeClass(){
        System.out.println("Open Test Application");
    }
    @AfterClass
    public void afterClass(){
        System.out.println("Close Test Application");
    }
    @BeforeSuite
    public void beforeSuite(){
        System.out.println("Chrome - Set Up System Property");
    }
    @AfterSuite
    public void afterSuite(){
        System.out.println("Chrome - Clean Up Cookies");
    }
}
/*
 * Before Suite --> Chrome Set up System Property
 * Before Test  --> Open Chrome
 * Before Class --> Open Test Application
 * Before Method --> Sign In
 * Test --> Search For Customer
 * After Method --> Sign Out
 * Before Method --> Sign In
 * Test --> Search For Product
 * After Method --> Sign Out
 * After Class --> Close Test Application
 * After Test --> Close Chrome
 * After Suite  --> Chrome - Clean Up Cookies
 *
 * Suite > Test > Class > Method > Include
 */

/*
`* TestNG run by default by Ascending Alphabetically with no Annotation
 */
