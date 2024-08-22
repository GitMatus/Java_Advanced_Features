package com.sda.advanced.collections.concurrent_programming;

public class FromThread extends Thread {

    private int threadIndex;

    public FromThread(int threadIndex) {
        this.threadIndex = threadIndex;
    }

    @Override
    public void run(){
        for (int i = 0; i < 5; i++) {
            System.out.println(this.threadIndex + "...." + i++);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }


    }
}
