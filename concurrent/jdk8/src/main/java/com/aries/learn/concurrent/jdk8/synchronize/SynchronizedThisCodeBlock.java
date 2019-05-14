package com.aries.learn.concurrent.jdk8.synchronize;

import java.util.concurrent.TimeUnit;

/**
 * synchronized关键词的第二种用法：代码块形式 + this对象锁
 * 用synchronized修饰后，两个线程不会交替执行；在没有synchronized修饰时，则可能会交替执行。
 *
 * @author arowana
 */
public class SynchronizedThisCodeBlock implements Runnable {
    @Override
    public void run() {
        synchronized (this) {
            for (int i = 0; i < 10; i++) {
                try {
                    System.out.println("当前执行的线程是：" + Thread.currentThread().getName());
                    TimeUnit.SECONDS.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void main(String[] args) {
        SynchronizedThisCodeBlock instance = new SynchronizedThisCodeBlock();

        // 实例化两个线程
        Thread t1 = new Thread(instance);
        Thread t2 = new Thread(instance);

        // 运行这两个线程
        t1.start();
        t2.start();
    }
}

