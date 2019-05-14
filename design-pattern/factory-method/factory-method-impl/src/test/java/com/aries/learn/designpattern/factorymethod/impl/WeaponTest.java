package com.aries.learn.designpattern.factorymethod.impl;

import com.aries.learn.designpattern.factorymethod.impl.bean.Weapon;
import com.aries.learn.designpattern.factorymethod.impl.factory.GoldSpearFactory;
import com.aries.learn.designpattern.factorymethod.impl.factory.IronSpearFactory;
import com.aries.learn.designpattern.factorymethod.impl.factory.WeaponFactory;
import org.junit.Test;

public class WeaponTest {

    @Test
    public void test1() {
        WeaponFactory factory = new GoldSpearFactory();
        Weapon weapon = factory.create();
        weapon.use();
    }

    @Test
    public void test2() {
        WeaponFactory factory = new IronSpearFactory();
        Weapon weapon = factory.create();
        weapon.use();
    }
}
