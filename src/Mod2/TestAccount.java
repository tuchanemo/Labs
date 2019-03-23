/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mod2;

/**
 *
 * @author Alex
 */
public class TestAccount {
    public static void main(String[] args) {
        Account MyAccount = new Account(255.86);
        System.out.println("Account balance is $"+MyAccount.getBalance());
    }
    
}
