package com.aries.learn.concurrent.jdk8;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * @author arowana
 */
public class CallablePooledTest {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newCachedThreadPool();
        Future<Integer> resultFuture = executorService.submit(new CalculatorCallable());
        System.out.println(resultFuture.get());
        executorService.shutdown();
    }
}
