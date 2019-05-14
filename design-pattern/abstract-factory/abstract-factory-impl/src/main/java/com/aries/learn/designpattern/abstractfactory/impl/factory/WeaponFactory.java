package com.aries.learn.designpattern.abstractfactory.impl.factory;

import com.aries.learn.designpattern.abstractfactory.impl.weapon.Lance;
import com.aries.learn.designpattern.abstractfactory.impl.weapon.Sabre;

public interface WeaponFactory {
    Lance createLance();

    Sabre createSabre();
}
