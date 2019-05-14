package com.aries.learn.designpattern.adapter.without.adapterclass.socket;

public class ThreePlugsElectricSocket implements ElectricSocket {

    @Override
    public int supportPlugNum() {
        return 3;
    }

    @Override
    public void supplylEctricity() {
        System.out.println("使用[三片]插座供电");
    }
}