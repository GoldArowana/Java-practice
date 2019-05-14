package com.aries.learn.concurrent.jdk8;

import java.util.concurrent.Callable;

/**
 * @author arowana
 */
public class CalculatorCallable implements Callable<Integer> {

    @Override
    public Integer call() throws Exception {
        return cal(10000);
    }

    private int cal(int num) {
        int sum = 0;
        for (int i = 0; i < num; i++) {
            sum += i;
        }
        return sum;
    }
}