package com.aries.learn.concurrent.jdk8.stopthread;

import java.util.concurrent.TimeUnit;

/**
 * run方法内没有sleep或wait方法时，停止线程
 *
 * @author arowana
 */
public class RightWayStopThreadWithoutSleep {
    private static Runnable runnable = () -> {
        for (int i = 0; !Thread.currentThread().isInterrupted() && i < 1000000; i++) {
            System.out.println(i);
        }
    };

    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(runnable);
        thread.start();

        TimeUnit.SECONDS.sleep(1);
        thread.interrupt();
    }
}
