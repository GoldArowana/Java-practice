package com.aries.learn.designpattern.singleton.hungry;

/**
 * 饿汉式
 */
public class Singleton {
    private static Singleton singleton = new Singleton();

    private Singleton() {

    }

    public static Singleton getInstance() {
        return singleton;
    }
}