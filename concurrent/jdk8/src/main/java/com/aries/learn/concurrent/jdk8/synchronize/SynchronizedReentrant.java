package com.aries.learn.concurrent.jdk8.synchronize;

/**
 * 演示synchronized的可重入性质
 * 在exe方法获取到this锁后，在内部嵌套的方法中，可以再次获取到this锁
 *
 * @author arowana
 */
public class SynchronizedReentrant {
    private synchronized void exe1() {
        System.out.println("1");
    }

    private synchronized void exe() {
        System.out.println("exe");
        exe1();
    }

    public static void main(String[] args) {
        SynchronizedReentrant instance = new SynchronizedReentrant();
        instance.exe();
    }
}
