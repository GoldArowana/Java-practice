package com.aries.learn.designpattern.adapter.adapterclass.adapter;

import com.aries.learn.designpattern.adapter.adapterclass.socket.ElectricSocket;
import com.aries.learn.designpattern.adapter.adapterclass.socket.ThreePlugsElectricSocket;

/**
 * 适配器，让三片式插座向外提供2个插孔，以支持2片式充电器。
 * extends + 现有的插座类型
 * implements + 目标插座类型
 */
public class ThreePlugsSocketAdapterToTwo extends ThreePlugsElectricSocket implements ElectricSocket {
    @Override
    public int supportPlugNum() {
        return 2;
    }

    @Override
    public void supplylEctricity() {
        System.out.println("适配器负责将[三片]插座变为[两片]插座。");
        super.supplylEctricity();
    }
}