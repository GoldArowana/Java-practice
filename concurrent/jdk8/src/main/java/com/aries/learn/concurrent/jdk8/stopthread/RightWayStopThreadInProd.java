package com.aries.learn.concurrent.jdk8.stopthread;

/**
 * 最佳实践1：catch了InterruptedException之后的优先选择：
 * 在方法签名中抛出异常 那么在run()就会强制try/catch
 *
 * @author arowana
 */
public class RightWayStopThreadInProd {
    private static Runnable runnable = () -> {
        while (!Thread.currentThread().isInterrupted()) {
            System.out.println("go");
            try {
                throwInMethod();
            } catch (InterruptedException e) {
                //保存日志、停止程序
                System.out.println("保存日志");
                e.printStackTrace();
            }
        }
    };

    private static void throwInMethod() throws InterruptedException {
        Thread.sleep(2000);
    }

    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(runnable);
        thread.start();
        Thread.sleep(1000);
        thread.interrupt();
    }
}
