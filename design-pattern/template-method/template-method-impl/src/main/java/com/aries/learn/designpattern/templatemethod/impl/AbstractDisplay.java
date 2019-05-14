package com.aries.learn.designpattern.templatemethod.impl;

public abstract class AbstractDisplay {
    public abstract void before();

    public abstract void print();

    public abstract void after();

    public void display() {
        before();
        print();
        after();
    }
}
