package com.ahsieh02.thread;

import com.ahsieh02.thread.object.ATM;
import com.ahsieh02.thread.object.BankAccount;

import java.util.ArrayList;

public class AtmExample {

    static final BankAccount account = new BankAccount(50, "account");
    static final BankAccount account1 = new BankAccount(50, "account1");
    static final BankAccount account2 = new BankAccount(50, "account2");

    public static void main(String[] args) {
        withoutSynchronizedExample();
        synchronizedMethodExample();
        synchronizedObjectExample();
        /*account1.topUp(100);



        Thread t1 = new Thread(() -> {
            ATM.synchronizedWithdraw(account1, 100);
        });

        Thread t2 = new Thread(() -> {
            ATM.synchronizedWithdraw(account1, 100);
        });

        t1.start();
        t2.start();

        account2.topUp(100);
        Thread t3 = new Thread(() -> {
            ATM.synchronizedWithdrawObject(account2, 100);
        });

        Thread t4 = new Thread(() -> {
            ATM.synchronizedWithdrawObject(account2, 100);
        });

        t3.start();
        t4.start();
*/
    }

    public static void withoutSynchronizedExample() {
        account.topUp(100);
        System.out.println("--- start withoutSynchronizedExample ---");

        ArrayList<Thread> threads = new ArrayList();
        threads.add(getBasicThread());
        threads.add(getBasicThread());
        threads.add(getBasicThread());
        threads.add(getBasicThread());
        threads.add(getBasicThread());

        threads.stream().forEach(Thread::start);
        threads.stream().forEach((thread -> {
            try {
                thread.join();
            } catch (Exception e) {
            }
        }));
        System.out.println(account);
        System.out.println("--- end withoutSynchronizedExample ---\n");
    }

    private static Thread getBasicThread() {
        return new Thread(() -> {
            for (int i = 0; i < 5 ; i++) {
                ATM.basicWithdraw(account, 2);
            }
        });
    }

    public static void synchronizedMethodExample() {
        account1.topUp(100);
        System.out.println("--- start synchronizedMethodExample ---");

        ArrayList<Thread> threads = new ArrayList();
        threads.add(getSynchronizedMethodThread());
        threads.add(getSynchronizedMethodThread());
        threads.add(getSynchronizedMethodThread());
        threads.add(getSynchronizedMethodThread());
        threads.add(getSynchronizedMethodThread());

        threads.stream().forEach(Thread::start);
        threads.stream().forEach((thread -> {
            try {
                thread.join();
            } catch (Exception e) {
            }
        }));
        System.out.println(account1);
        System.out.println("--- end synchronizedMethodExample ---\n");
    }

    private static Thread getSynchronizedMethodThread() {
        return new Thread(() -> {
            for (int i = 0; i < 5 ; i++) {
                ATM.synchronizedWithdraw(account1, 2);
            }
        });
    }

    public static void synchronizedObjectExample() {
        account2.topUp(100);
        System.out.println("--- start synchronizedMethodExample ---");

        ArrayList<Thread> threads = new ArrayList();
        threads.add(getSynchronizedObjectThread());
        threads.add(getSynchronizedObjectThread());
        threads.add(getSynchronizedObjectThread());
        threads.add(getSynchronizedObjectThread());
        threads.add(getSynchronizedObjectThread());

        threads.stream().forEach(Thread::start);
        threads.stream().forEach((thread -> {
            try {
                thread.join();
            } catch (Exception e) {
            }
        }));
        System.out.println(account2);
        System.out.println("--- end synchronizedMethodExample ---\n");
    }

    private static Thread getSynchronizedObjectThread() {
        return new Thread(() -> {
            for (int i = 0; i < 5 ; i++) {
                ATM.synchronizedWithdraw(account2, 2);
            }
        });
    }
}
