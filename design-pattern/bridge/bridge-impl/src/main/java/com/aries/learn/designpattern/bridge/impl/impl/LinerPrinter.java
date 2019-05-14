package com.aries.learn.designpattern.bridge.impl.impl;

public class LinerPrinter implements Printer {
    @Override
    public void printBefore() {
        System.out.println("---------");
    }

    @Override
    public void printSomething() {
        System.out.println("疑是地上霜");
    }

    @Override
    public void printAfter() {
        System.out.println("---------");
    }
}
