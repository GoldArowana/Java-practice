package com.aries.learn.concurrent.jdk8.synchronize;

import java.util.concurrent.TimeUnit;

/**
 * synchronized关键词的第四种用法：在普通成员方法前面修饰synchronized关键词。
 * 这种用法等价于第二种用法{@link SynchronizedThisCodeBlock}
 * 用synchronized修饰后，两个线程不会交替执行；在没有synchronized修饰时，则可能会交替执行。
 *
 * @author arowana
 */
public class SynchronizedMethod implements Runnable {
    @Override
    public void run() {
        innerSyncMethod();
    }

    private synchronized void innerSyncMethod() {
        for (int i = 0; i < 10; i++) {
            try {
                System.out.println("当前执行的线程是：" + Thread.currentThread().getName());
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
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
