package com.aries.learn.designpattern.singleton.lazy.innerstaticclass;

public class Singleton {
    private static class LazyHolder {
        private static final Singleton singleton = new Singleton();
    }

    private Singleton() {

    }

    public static Singleton getInstance() {
        return LazyHolder.singleton;
    }
}
