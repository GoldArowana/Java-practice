package com.aries.learn.concurrent.jdk8;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * @author arowana
 */
public class FutureTaskSimpleTest {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        FutureTask<Integer> futureTask = new FutureTask<>(new CalculatorCallable());
        futureTask.run();
        Integer result = futureTask.get();
        System.out.println(result);
    }
}
