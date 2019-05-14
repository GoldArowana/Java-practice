package com.aries.learn.designpattern.singleton.hungry;

import org.junit.Test;

import java.lang.reflect.Constructor;


public class SingletonTest {

    @Test
    public void testSingleton() {
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();
        System.out.println(s1 == s2); // true，单例每次获取到的都是同一个对象
    }

    @Test
    public void testFelect() throws Exception {
        // 自定义单例方法获取
        Singleton s1 = Singleton.getInstance();

        // 反射获取
        Constructor constructor = Singleton.class.getDeclaredConstructor();
        constructor.setAccessible(true);
        Singleton s2 = (Singleton) constructor.newInstance();

        System.out.println(s1 == s2);//false，反射破坏了单例
    }
}
