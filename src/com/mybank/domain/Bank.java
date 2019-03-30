package com.mybank.domain;

public class Bank {

    private Customer[] customers = new Customer[1000];

    private int numOfClients = 0;

    public static Bank getBank() {
        return new Bank();
    }

    private Bank() {

    }

    public Customer getCustomer(int cusNo) {
        if (cusNo < customers.length) {
            return customers[cusNo];
        }
        return null;
    }

    public void addCustomer(Customer newCustomer) {
        customers[numOfClients] = newCustomer;
        numOfClients++;
    }

    public int getNumOfClients() {
        return numOfClients;
    }
    
}
