package com.aries.learn.designpattern.adapter.without.adapterinterface;

public class Lenovo implements Shutdown {
    @Override
    public void shutdownImmediately() {
        System.out.println("执行操作：立即关机。Lenovo关机中...");
    }

    @Override
    public void shutdownForcely() {
        System.out.println("执行操作：强制关机。Lenovo放弃所有job，强制关机中...");
    }

    @Override
    public void shutdownGracefully() {
        throw new RuntimeException("未实现本方法");
    }

    @Override
    public void shutdownLater(long mills) {
        throw new RuntimeException("未实现本方法");
    }
}
