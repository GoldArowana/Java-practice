package com.aries.learn.designpattern.abstractfactory.impl.weapon;

public class GoldSabre implements Sabre {
    @Override
    public void use() {
        System.out.println("金剑");
    }
}
