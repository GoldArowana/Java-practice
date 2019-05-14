package com.aries.learn.concurrent.jdk8.stopthread;

/**
 * 带有sleep的中断线程的写法
 *
 * @author arowana
 */
public class RightWayStopThreadWithSleep {

    private static Runnable runnable = () -> {
        for (int i = 0; !Thread.currentThread().isInterrupted() && i < 1000000; i++) {
            System.out.println(i);
        }

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("在sleep时被中断");
        }

    };

    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(runnable);
        thread.start();
        Thread.sleep(500);
        thread.interrupt();
    }
}