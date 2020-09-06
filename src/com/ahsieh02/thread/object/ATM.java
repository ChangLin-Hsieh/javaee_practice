package com.ahsieh02.thread.object;

public class ATM {

    private static final Object lock = new Object();

    public static void basicWithdraw(BankAccount account, int amount) {
        int balance = account.getBalance();
        if ((balance - amount) < -account.getOverdraft()) {
            System.out.println("Transaction denied! AccountName[" + account.getAccountName() + "]");
        } else {
            account.debit(amount);
            System.out.println("AccountName[" + account.getAccountName() + "] $" + amount + " successfully withdraw");
        }
        System.out.println("AccountName[" + account.getAccountName() + "] Current Balance: $" + account.getBalance());
    }

    public synchronized static void synchronizedWithdraw(BankAccount account, int amount) {
        int balance = account.getBalance();
        if ((balance - amount) < -account.getOverdraft()) {
            System.out.println("Transaction denied! AccountName[" + account.getAccountName() + "]");
        } else {
            account.debit(amount);
            System.out.println("AccountName[" + account.getAccountName() + "] $" + amount + " successfully withdraw");
        }
        System.out.println("AccountName[" + account.getAccountName() + "] Current Balance: $" + account.getBalance());
    }

    public static void synchronizedWithdrawObject(BankAccount account, int amount) {

        synchronized (lock) {
            int balance = account.getBalance();
            if ((balance - amount) < -account.getOverdraft()) {
                System.out.println("Transaction denied! AccountName[" + account.getAccountName() + "]");
            } else {
                account.debit(amount);
                System.out.println("AccountName[" + account.getAccountName() + "] $" + amount + " successfully withdraw");
            }
            System.out.println("AccountName[" + account.getAccountName() + "] Current Balance: $" + account.getBalance());
        }
    }
}
