package com.aries.learn.designpattern.abstractfactory.impl.factory;

import com.aries.learn.designpattern.abstractfactory.impl.weapon.GoldLance;
import com.aries.learn.designpattern.abstractfactory.impl.weapon.GoldSabre;
import com.aries.learn.designpattern.abstractfactory.impl.weapon.Lance;
import com.aries.learn.designpattern.abstractfactory.impl.weapon.Sabre;

public class GoldWeaponFactory implements WeaponFactory {
    @Override
    public Lance createLance() {
        return new GoldLance();
    }

    @Override
    public Sabre createSabre() {
        return new GoldSabre();
    }
}
