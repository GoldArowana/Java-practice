package com.aries.learn.designpattern.abstractfactory.impl;

import com.aries.learn.designpattern.abstractfactory.impl.factory.GoldWeaponFactory;
import com.aries.learn.designpattern.abstractfactory.impl.factory.IronWeaponFactory;
import com.aries.learn.designpattern.abstractfactory.impl.factory.WeaponFactory;
import com.aries.learn.designpattern.abstractfactory.impl.weapon.Lance;
import org.junit.Test;


public class WeaponTest {

    @Test
    public void test1() {
        WeaponFactory factory = new GoldWeaponFactory();
        Lance lance = factory.createLance();
        lance.use();
    }


    @Test
    public void test2() {
        WeaponFactory factory = new IronWeaponFactory();
        Lance lance = factory.createLance();
        lance.use();
    }
}
