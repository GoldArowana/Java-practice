package com.aries.learn.designpattern.adapter.adapterinterface;

public class MacOS extends ShutdownAdapter {

    @Override
    public void shutdownImmediately() {
        System.out.println("执行操作：立即关机。MacOS关机中...");
    }
}
