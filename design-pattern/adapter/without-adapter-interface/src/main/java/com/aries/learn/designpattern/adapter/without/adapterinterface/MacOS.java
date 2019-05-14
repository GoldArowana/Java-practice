package com.aries.learn.designpattern.adapter.without.adapterinterface;

public class MacOS implements Shutdown {

    @Override
    public void shutdownImmediately() {
        System.out.println("执行操作：立即关机。MacOS关机中...");
    }

    @Override
    public void shutdownForcely() {
        throw new RuntimeException("未实现本方法");
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
