package com.aries.learn.designpattern.simplefactory.without;

public class SubOperation implements Operation {

    /**
     * 减法计算
     */
    public double getResult(double numberA, double numberB) {
        return numberA - numberB;
    }
}
