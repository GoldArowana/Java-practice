package com.aries.learn.concurrent.jdk8;

/**
 * @author arowana
 */
public class CallableSimpleTest {
    public static void main(String[] args) throws Exception {
        CalculatorCallable calculatorCallable = new CalculatorCallable();
        Integer result = calculatorCallable.call();
        System.out.println(result);
    }
}
