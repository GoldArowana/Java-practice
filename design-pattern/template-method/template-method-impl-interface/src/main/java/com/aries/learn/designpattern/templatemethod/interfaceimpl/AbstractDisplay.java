package com.aries.learn.designpattern.templatemethod.interfaceimpl;

public interface AbstractDisplay {
    public abstract void before();

    public abstract void print();

    public abstract void after();

    default void display() {
        before();
        print();
        after();
    }
}
