package com.aries.learn.designpattern.abstractfactory.impl.factory;

import com.aries.learn.designpattern.abstractfactory.impl.weapon.IronLance;
import com.aries.learn.designpattern.abstractfactory.impl.weapon.IronSabre;
import com.aries.learn.designpattern.abstractfactory.impl.weapon.Lance;
import com.aries.learn.designpattern.abstractfactory.impl.weapon.Sabre;

public class IronWeaponFactory implements WeaponFactory {
    @Override
    public Lance createLance() {
        return new IronLance();
    }

    @Override
    public Sabre createSabre() {
        return new IronSabre();
    }
}
