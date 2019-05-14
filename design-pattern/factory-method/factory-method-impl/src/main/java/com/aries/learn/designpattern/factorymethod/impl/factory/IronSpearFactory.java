package com.aries.learn.designpattern.factorymethod.impl.factory;

import com.aries.learn.designpattern.factorymethod.impl.bean.IronSpear;
import com.aries.learn.designpattern.factorymethod.impl.bean.Weapon;

public class IronSpearFactory implements WeaponFactory {
    @Override
    public Weapon create() {
        return new IronSpear();
    }
}
