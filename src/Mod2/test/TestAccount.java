/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mod2.test;

import com.mybank.domain.Account;
import com.mybank.domain.Bank;
import com.mybank.domain.CheckingAccount;
import com.mybank.domain.Customer;
import com.mybank.domain.SavingsAccount;

/**
 *
 * @author Alex
 */
public class TestAccount {

    public static void main(String[] args) {
        
        Bank newBank = Bank.getBank();
        
        Customer firstCustomer = new Customer("John Doe");
        Customer secondCustomer = new Customer("Jane Doe");

        SavingsAccount johnSavings = new SavingsAccount(1000, 5);
        CheckingAccount johnAccount = new CheckingAccount(5000, 1000);
        CheckingAccount janeAccount = new CheckingAccount(500, 100);
        firstCustomer.addAccount(johnSavings);
        firstCustomer.addAccount(johnAccount);
        secondCustomer.addAccount(janeAccount);
        newBank.addCustomer(firstCustomer);
        newBank.addCustomer(secondCustomer);

        System.out.println(newBank.getCustomer(0));
        System.out.println(newBank.getCustomer(1));
        
        newBank.getCustomer(0).getAccount(0).deposit(2000);
        newBank.getCustomer(0).getAccount(1).withdraw(5500);
        ((SavingsAccount)newBank.getCustomer(0).getAccount(0)).addInterestRate();
//        System.out.println("");
        
        System.out.println(newBank.getCustomer(0));
        System.out.println(newBank.getCustomer(1));
        
    }
}
