package com.aries.learn.designpattern.factorymethod.impl.factory;

import com.aries.learn.designpattern.factorymethod.impl.bean.GoldSpear;
import com.aries.learn.designpattern.factorymethod.impl.bean.Weapon;

public class GoldSpearFactory implements WeaponFactory {
    @Override
    public Weapon create() {
        return new GoldSpear();
    }
}
