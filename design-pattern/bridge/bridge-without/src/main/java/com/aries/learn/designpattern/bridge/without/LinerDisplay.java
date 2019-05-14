package com.aries.learn.designpattern.bridge.without;

public class LinerDisplay extends Display {

    protected void before() {
        System.out.println("---------");
    }

    protected void after() {
        System.out.println("---------");
    }
}
