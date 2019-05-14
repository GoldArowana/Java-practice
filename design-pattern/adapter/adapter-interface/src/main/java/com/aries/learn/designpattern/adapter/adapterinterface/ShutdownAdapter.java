package com.aries.learn.designpattern.adapter.adapterinterface;

public class ShutdownAdapter implements Shutdown {
    @Override
    public void shutdownImmediately() {
        throw new RuntimeException("未实现本方法");
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
