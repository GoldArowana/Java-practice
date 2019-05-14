package com.aries.learn.concurrent.jdk8.stopthread.volatiledemo;

/**
 * 演示用volatile停止线程的局限：这种方式看似可行(在本例子中没问题)
 *
 * @author arowana
 */
public class WrongWayVolatile {
    private static volatile boolean canceled = false;
    private static Runnable runnable = () -> {
        int num = 0;
        try {
            while (num <= 100000 && !canceled) {
                if (num % 100 == 0) {
                    System.out.println(num + "是100的倍数。");
                }
                num++;
                Thread.sleep(1);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    };

    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(runnable);
        thread.start();
        Thread.sleep(5000);
        canceled = true;
    }
}

