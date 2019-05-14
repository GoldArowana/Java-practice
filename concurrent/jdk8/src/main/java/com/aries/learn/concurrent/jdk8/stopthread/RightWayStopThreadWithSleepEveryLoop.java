package com.aries.learn.concurrent.jdk8.stopthread;

/**
 * 如果在执行过程中，每次循环都会调用sleep或wait等方法，那么不需要每次迭代都检查是否已中断
 *
 * @author arowana
 */
public class RightWayStopThreadWithSleepEveryLoop {
    private static Runnable runnable = () -> {
        try {
            for (int i = 0; !Thread.currentThread().isInterrupted() && i < 1000000; i++) {
                System.out.println(i);
                Thread.sleep(10);
            }
        } catch (InterruptedException e) {
            System.out.println("在sleep时被中断");
        }
    };

    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(runnable);
        thread.start();
        Thread.sleep(3000);
        thread.interrupt();
    }
}