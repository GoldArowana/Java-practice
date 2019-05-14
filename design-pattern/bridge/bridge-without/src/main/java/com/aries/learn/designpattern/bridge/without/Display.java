package com.aries.learn.designpattern.bridge.without;

public class Display {
    protected void before() {

    }

    protected void after() {

    }

    public void display() {
        before();
        System.out.println("疑是地上霜");
        after();
    }
}
