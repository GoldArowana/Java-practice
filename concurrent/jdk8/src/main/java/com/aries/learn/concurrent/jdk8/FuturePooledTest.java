package com.aries.learn.concurrent.jdk8;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;

/**
 * @author arowana
 */
public class FuturePooledTest {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newCachedThreadPool();
        FutureTask<Integer> futureTask = new FutureTask<>(new CalculatorCallable());
        executorService.submit(futureTask);
        System.out.println(futureTask.get());
        executorService.shutdown();
    }
}
