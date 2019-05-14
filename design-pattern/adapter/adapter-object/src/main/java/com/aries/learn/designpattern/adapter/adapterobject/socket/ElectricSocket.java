package com.aries.learn.designpattern.adapter.adapterobject.socket;

/**
 * 插座
 */
public interface ElectricSocket {
    /**
     * @return 插座的插孔数
     */
    int supportPlugNum();

    /**
     * 供电功能
     */
    void supplylEctricity();
}