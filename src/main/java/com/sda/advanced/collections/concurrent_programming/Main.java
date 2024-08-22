package com.sda.advanced.collections.concurrent_programming;

public class Main {
    public static void main(String[] args) {
//        FromThread fromThread1 = new FromThread();
//        FromThread fromThread2 = new FromThread();

//        fromThread1.run();
//        fromThread2.run();

//        fromThread1.start();
//        fromThread2.start();

        for (int i = 0; i < 10; i++) {
            FromThread fromThread = new FromThread(i);
            fromThread.start();
        }
    }
}
