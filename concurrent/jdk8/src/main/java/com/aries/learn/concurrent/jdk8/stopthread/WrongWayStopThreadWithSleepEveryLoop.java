package com.aries.learn.concurrent.jdk8.stopthread;

/**
 * 如果把响应中断的try catch放到循环里，就很容易出错。
 * 在指定到sleep时如果发生的中断，那么
 * 1. 会catch住，并且中断标记会被清除。
 * 2. 而且在进入到下一个循环时，仍可以继续执行，因为Thread.currentThread().isInterrupted()仍然为false
 * <p>
 * 正确方式请参考：{@link RightWayStopThreadWithSleepEveryLoop}
 *
 * @author arowana
 */
public class WrongWayStopThreadWithSleepEveryLoop {
    private static Runnable runnable = () -> {
        for (int i = 0; !Thread.currentThread().isInterrupted() && i < 1000000; i++) {
            System.out.println(i);

            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                System.out.println("在sleep时被中断");
            }
        }
    };

    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(runnable);
        thread.start();
        Thread.sleep(5000);
        thread.interrupt();
    }
}