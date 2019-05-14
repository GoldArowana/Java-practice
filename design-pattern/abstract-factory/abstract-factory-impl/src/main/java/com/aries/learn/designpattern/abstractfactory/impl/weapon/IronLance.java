package com.aries.learn.designpattern.abstractfactory.impl.weapon;

public class IronLance implements Lance {
    @Override
    public void use() {
        System.out.println("铁矛");
    }
}
