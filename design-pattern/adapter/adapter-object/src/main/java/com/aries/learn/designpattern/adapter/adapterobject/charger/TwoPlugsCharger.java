package com.aries.learn.designpattern.adapter.adapterobject.charger;


import com.aries.learn.designpattern.adapter.adapterobject.socket.ElectricSocket;

/**
 * 两片式充电器
 */
public class TwoPlugsCharger {

    /**
     * 插座
     */
    private ElectricSocket electricSocket;

    public void setElectricSocket(ElectricSocket electricSocket) throws Exception {
        if (electricSocket.supportPlugNum() != 2) {
            throw new Exception("充电器是2片，插座是" + electricSocket.supportPlugNum() + "片，插不上啊！");
        }
        this.electricSocket = electricSocket;
    }

    public void charge() throws Exception {
        if (electricSocket == null) {
            throw new Exception("你还没把充电器插到插座上呢");
        }
        System.out.println("使用[两片]插头充电器");
        electricSocket.supplylEctricity();
    }
}
