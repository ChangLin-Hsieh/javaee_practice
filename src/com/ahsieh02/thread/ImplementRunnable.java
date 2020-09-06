package com.ahsieh02.thread;

public class ImplementRunnable implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(i + " " + Thread.currentThread().getName());
        }
    }


    public static void main(String[] args) {
        System.out.println(Thread.activeCount());
        ImplementRunnable threadExample = new ImplementRunnable();

        Thread thread1 = new Thread(new ImplementRunnable());
        Thread thread2 = new Thread(new ImplementRunnable());
        thread1.start();
        thread2.start();
    }
}
