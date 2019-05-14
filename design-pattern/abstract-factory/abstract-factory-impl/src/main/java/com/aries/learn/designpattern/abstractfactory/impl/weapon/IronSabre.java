package com.aries.learn.designpattern.abstractfactory.impl.weapon;

public class IronSabre implements Sabre {
    @Override
    public void use() {
        System.out.println("铁剑");
    }
}
