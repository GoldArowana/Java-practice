package com.aries.learn.designpattern.bridge.impl.impl;

public class SimplePrinter implements Printer {
    @Override
    public void printBefore() {

    }

    @Override
    public void printSomething() {
        System.out.println("疑是地上霜");
    }

    @Override
    public void printAfter() {

    }


}
