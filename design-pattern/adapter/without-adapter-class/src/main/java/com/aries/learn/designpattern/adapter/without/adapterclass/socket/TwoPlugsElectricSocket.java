package com.aries.learn.designpattern.adapter.without.adapterclass.socket;

public class TwoPlugsElectricSocket implements ElectricSocket {

    @Override
    public int supportPlugNum() {
        return 2;
    }

    @Override
    public void supplylEctricity() {
        System.out.println("使用[两片]插座供电");
    }
}