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
public class Account {

    private double balance;

    public Account(double balance) {
        if (this.balance >= 0) {
            this.balance = balance;
        } else {
            this.balance = 0;
        }
    }

    /**
     * @return the balance
     */
    public double getBalance() {
        return balance;
    }

}
