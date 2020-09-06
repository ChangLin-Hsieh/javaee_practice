package com.ahsieh02.thread.object;

public class BankAccount {

    private int balance =0;
    private final int overdraft;
    private String accountName;
    public BankAccount(int overdraft, String accountName) {
        this.overdraft = overdraft;
        this.accountName = accountName;
    }

    public void topUp(int amount) {
        balance += amount;
    }

    public void debit(int amount) {
        balance -= amount;
    }

    public int getBalance() {
        return balance;
    }

    public int getOverdraft() {
        return overdraft;
    }

    public String getAccountName() {
        return accountName;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "balance=" + balance +
                ", overdraft=" + overdraft +
                ", accountName='" + accountName + '\'' +
                '}';
    }
}
