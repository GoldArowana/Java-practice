package com.aries.learn.concurrent.jdk8.synchronize;

/**
 * 本类是线程不安全的一个demo。
 * 两个线程分别对counter进行1万次加1操作，最终结果本应该是2万，
 * 但由于线程安全问题，往往最终结果不到2万。(counter <= 2万)
 *
 * @author arowana
 */
public class ThreadUnsafeWithoutSynchronized1 {
    private static final int THOUSAND = 1000;
    private static int counter = 0;

    private static Runnable runnable = () -> {
        for (int i = 0; i < 10 * THOUSAND; i++) {
            counter++;
        }
    };

    public static void main(String[] args) throws InterruptedException {
        // 实例化两个线程
        Thread t1 = new Thread(runnable);
        Thread t2 = new Thread(runnable);

        // 运行这两个线程
        t1.start();
        t2.start();

        // 让主线程等待t1和t2执行完。
        t1.join();
        t2.join();

        // t1和t2执行完后，打印counter的最终结果。
        System.out.println(counter);
    }
}