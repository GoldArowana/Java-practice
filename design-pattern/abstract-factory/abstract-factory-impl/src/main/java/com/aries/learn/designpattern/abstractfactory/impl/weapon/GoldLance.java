package com.aries.learn.designpattern.abstractfactory.impl.weapon;

public class GoldLance implements Lance {

    @Override
    public void use() {
        System.out.println("金矛");
    }
}
