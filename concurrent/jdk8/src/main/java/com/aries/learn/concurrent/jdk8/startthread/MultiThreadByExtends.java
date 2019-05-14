package com.aries.learn.concurrent.jdk8.startthread;

/**
 * @author arowana
 */
public class MultiThreadByExtends {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.start();
    }
}

class MyThread extends Thread {
    @Override
    public void run() {
        System.out.println(this.getName() + " is running");
    }
}