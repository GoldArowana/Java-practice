package com.aries.learn.designpattern.adapter.adapterobject;

import com.aries.learn.designpattern.adapter.adapterobject.adapter.ThreePlugsSocketAdapterToTwo;
import com.aries.learn.designpattern.adapter.adapterobject.charger.TwoPlugsCharger;
import com.aries.learn.designpattern.adapter.adapterobject.socket.ThreePlugsElectricSocket;
import org.junit.Test;


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
        // 3片式插座
        ThreePlugsElectricSocket threePlugsElectricSocket = new ThreePlugsElectricSocket();

        // 将2片式充电器插到适配器上。适配器能让3片式插孔转变为2片式的插孔。
        try {
            charger.setElectricSocket(new ThreePlugsSocketAdapterToTwo(threePlugsElectricSocket));
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
