package com.aries.learn.designpattern.adapter.without.adapterclass;

import com.aries.learn.designpattern.adapter.without.adapterclass.charger.TwoPlugsCharger;
import com.aries.learn.designpattern.adapter.without.adapterclass.socket.ThreePlugsElectricSocket;
import com.aries.learn.designpattern.adapter.without.adapterclass.socket.TwoPlugsElectricSocket;
import org.junit.Test;

/**
 * `without-adapter-class` 和 `without-adapter-object` 里的代码是一模一样的。
 */
public class ChargerTest {

    @Test
    public void forceChargeTest() {
        // 2片式充电器，
        TwoPlugsCharger charger = new TwoPlugsCharger();

        // 将2片式充电器插到3片式插座上。会抛异常。
        try {
            charger.setElectricSocket(new ThreePlugsElectricSocket());
        } catch (Exception e) {
            System.out.println("setElectricSocket异常！！" + e.getMessage());
            return;
        }
        try {
            charger.charge();
        } catch (Exception e) {
            System.out.println("charge异常！！" + e.getMessage());
            return;
        }
    }

    @Test
    public void chargeWithAdapterTest() {
        // 2片式充电器，
        TwoPlugsCharger charger = new TwoPlugsCharger();

        // 将2片式充电器插到2片式插座上。正常运行。
        try {
            charger.setElectricSocket(new TwoPlugsElectricSocket());
        } catch (Exception e) {
            System.out.println("setElectricSocket异常！！" + e.getMessage());
            return;
        }
        try {
            charger.charge();
        } catch (Exception e) {
            System.out.println("charge异常！！" + e.getMessage());
            return;
        }
    }
}
