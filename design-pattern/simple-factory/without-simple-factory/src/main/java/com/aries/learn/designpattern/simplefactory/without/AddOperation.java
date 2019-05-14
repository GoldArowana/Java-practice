package com.aries.learn.designpattern.simplefactory.without;

public class AddOperation implements Operation {

    /**
     * 加法计算
     */
    public double getResult(double numberA, double numberB) {

        return numberA + numberB;
    }
}