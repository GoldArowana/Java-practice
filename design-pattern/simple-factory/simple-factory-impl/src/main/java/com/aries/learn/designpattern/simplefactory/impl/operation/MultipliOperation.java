package com.aries.learn.designpattern.simplefactory.impl.operation;

public class MultipliOperation implements Operation {

    /**
     * 乘法计算
     */
    public double getResult(double numberA, double numberB) {
        return numberA * numberB;
    }
}
