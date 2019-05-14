package com.aries.learn.designpattern.factorymethod.without;

import org.junit.Test;

public class WeaponTest {
    @Test
    public void test1() {
        Weapon weapon = new IronSpear();
        weapon.use();
    }

    @Test
    public void test2() {
        Weapon weapon = new GoldSpear();
        weapon.use();
    }
}
