package com.aries.learn.designpattern.singleton.enumimpl;

public enum Singleton {
    SINGLETON;

    Singleton() {

    }

    public static Singleton getInstance() {
        return SINGLETON;
    }
}
