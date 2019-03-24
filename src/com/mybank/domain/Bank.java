package com.mybank.domain;

public class Bank {

    private Customer[] customers;
    
    private int numOfClients;

    public Bank() {
        customers = new Customer[1000];
        numOfClients = 0;
    }

    public Customer getCustomer(int cusNo) {
        if (cusNo < customers.length) {
            return customers[cusNo];
        }
        return null;
    }

    public void addCustomer(Customer newCustomer) {
        customers[numOfClients]=newCustomer;
        numOfClients++;
    }
}
