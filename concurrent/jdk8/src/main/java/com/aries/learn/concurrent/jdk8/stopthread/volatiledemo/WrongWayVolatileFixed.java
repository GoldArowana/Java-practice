package com.aries.learn.concurrent.jdk8.stopthread.volatiledemo;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;

/**
 * 用中断来修复{@link WrongWayVolatileCantStop}的无尽等待问题
 *
 * @author arowana
 */
public class WrongWayVolatileFixed {

    public static void main(String[] args) throws InterruptedException {
        ArrayBlockingQueue storage = new ArrayBlockingQueue(10);

        // 开辟新线程运行生产者，然后睡眠1秒
        Producer producer = new Producer(storage);
        Thread producerThread = new Thread(producer);
        producerThread.start();
        TimeUnit.SECONDS.sleep(1);

        // 创建消费者
        Consumer consumer = new Consumer(storage);
        // 若干次消费后，就会退出这个循环
        while (consumer.needMoreNums()) {
            System.out.println(consumer.storage.take() + "被消费了");
            Thread.sleep(100);
        }
        System.out.println("消费者不需要更多数据了。");

        producerThread.interrupt();
    }


    static class Producer implements Runnable {
        BlockingQueue storage;

        Producer(BlockingQueue storage) {
            this.storage = storage;
        }

        @Override
        public void run() {
            int num = 0;
            try {
                while (num <= 100000 && !Thread.currentThread().isInterrupted()) {
                    if (num % 100 == 0) {
                        storage.put(num);
                        System.out.println(num + "是100的倍数,被放到仓库中了。");
                    }
                    num++;
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                System.out.println("生产者结束运行");
            }
        }
    }

    static class Consumer {
        BlockingQueue storage;

        Consumer(BlockingQueue storage) {
            this.storage = storage;
        }

        /**
         * 百分之5的概率会返回false
         */
        boolean needMoreNums() {
            return Math.random() < 0.95;
        }
    }
}
