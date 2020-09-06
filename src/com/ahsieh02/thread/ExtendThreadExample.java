package com.ahsieh02.thread;

public class ExtendThreadExample extends Thread {
    @Override
    public void run() {
        for (int i = 0 ; i < 10 ; i++) {
            System.out.println(i + " " + this.getName());
        }
    }

    public static void main(String[] args) {
        System.out.println(Thread.activeCount());
        ExtendThreadExample threadExample = new ExtendThreadExample();
        ExtendThreadExample threadExample1 = new ExtendThreadExample();

        threadExample.start();
        threadExample1.start();
    }
}
