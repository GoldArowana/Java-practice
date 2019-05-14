package com.aries.learn.designpattern.singleton.lazy.synchronize;

import org.junit.Test;


public class SingletonTest {

    @Test
    public void simpleTest() {
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();

        System.out.println(s1 == s2);//true，在单线程下正确执行
    }
}
