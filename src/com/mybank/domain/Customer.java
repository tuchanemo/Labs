package com.mybank.domain;

public class Customer {

    private Account[] accounts;

    private String fullName;

    private int customerNumber;

    private static int customerNumberBase = 1000;

    private int numOfAccounts;

    public Customer(String fullName) {
        accounts = new Account[10];
        this.fullName = fullName;
        this.customerNumber = customerNumberBase++;
        this.numOfAccounts = 0;
    }

    public Account getAccount(int accNo) {
        if (accNo < accounts.length && numOfAccounts != 0) {
            return accounts[accNo];
        }
        return null;
    }

    @Override
    public String toString() {
        String s = "Customer: " + "fullName=" + fullName + ", customerNumber=" + customerNumber + ", numofAccounts=" + numOfAccounts;
        for (int i = 0; i < this.numOfAccounts; i++) {
            Account acc = getAccount(i);
            if (acc instanceof SavingsAccount) {
                s = s + "\n\t" + (i + 1) + " Saving account with interest rate %" + ((SavingsAccount) acc).getInterestRate();
            } else {
                s = s + "\n\t" + (i + 1) + " Checking account with overdaft $" + ((CheckingAccount) acc).getOverdraftAmount();
            }
            s = s + " balance $" + acc.getBalance();
        }
        s = s + "\n";
        return s;
    }

    
    public void addAccount(Account acc) {
        accounts[numOfAccounts] = acc;
        numOfAccounts++;
    }
}
