package com.aries.learn.designpattern.adapter.adapterobject.adapter;


import com.aries.learn.designpattern.adapter.adapterobject.socket.ElectricSocket;
import com.aries.learn.designpattern.adapter.adapterobject.socket.ThreePlugsElectricSocket;
import lombok.AllArgsConstructor;

/**
 * 适配器，让三片式插座向外提供2个插孔，以支持2片式充电器。
 * implements + 目标插座类型
 */
@AllArgsConstructor
public class ThreePlugsSocketAdapterToTwo implements ElectricSocket {
    ThreePlugsElectricSocket threePlugsElectricSocket;

    @Override
    public int supportPlugNum() {
        return 2;
    }

    @Override
    public void supplylEctricity() {
        if (threePlugsElectricSocket == null) {
            throw new RuntimeException("适配器没插到插座上啊。先把适配器插到插座上吧。");
        }
        System.out.println("适配器负责将[三片]插座变为[两片]插座。");
        threePlugsElectricSocket.supplylEctricity();
    }
}