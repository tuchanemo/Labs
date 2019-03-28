package com.mybank.domain;

public class Bank {

    private static Customer[] customers = new Customer[1000];

    private static int numOfClients = 0;

    private Bank() {

    }

    public static Customer getCustomer(int cusNo) {
        if (cusNo < customers.length) {
            return customers[cusNo];
        }
        return null;
    }

    public static void addCustomer(Customer newCustomer) {
        customers[numOfClients] = newCustomer;
        numOfClients++;
    }

    public static int getNumOfClients() {
        return numOfClients;
    }
    
}
