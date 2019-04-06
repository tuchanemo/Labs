/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mybank.domain;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Alex
 */
public class BankTest {
    Bank bank = Bank.getBank();
        
    Customer firstCustomer = new Customer("John", "Doe");
    Customer secondCustomer = new Customer("Jane", "Doe");

    public BankTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        SavingsAccount johnSavings = new SavingsAccount(1000, 5);
        CheckingAccount johnAccount = new CheckingAccount(5000, 1000);
        CheckingAccount janeAccount = new CheckingAccount(500, 100);
        firstCustomer.addAccount(johnSavings);
        firstCustomer.addAccount(johnAccount);
        secondCustomer.addAccount(janeAccount);
        bank.addCustomer(firstCustomer);
        bank.addCustomer(secondCustomer);
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getBank method, of class Bank.
     */
    @Test
    public void testGetBank() {
        System.out.println("getBank - only one instance of Bank");
        Bank expResult = bank;
        Bank result = Bank.getBank();
        assertEquals(expResult, result);
    }

    /**
     * Test of getCustomer method, of class Bank.
     */
    @Test
    public void testGetCustomer() {
        System.out.println("getCustomer");
        int cusNo = 0;
        Bank instance = bank;
        Customer expResult = firstCustomer;
        Customer result = instance.getCustomer(cusNo);
        assertEquals(expResult, result);
    }

    /**
     * Test of addCustomer method, of class Bank.
     */
    @Test
    public void testAddCustomer() {
        System.out.println("addCustomer");
        Customer newCustomer = null;
        Bank instance = null;
        instance.addCustomer(newCustomer);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNumOfClients method, of class Bank.
     */
    @Test
    public void testGetNumOfClients() {
        System.out.println("getNumOfClients");
        Bank instance = null;
        int expResult = 0;
        int result = instance.getNumOfClients();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
