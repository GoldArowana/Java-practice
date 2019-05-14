package com.aries.learn.designpattern.adapter.adapterinterface;

public class Samsung extends ShutdownAdapter {
    @Override
    public void shutdownImmediately() {
        System.out.println("执行操作：立即关机。Samsung关机中...");
    }

    @Override
    public void shutdownLater(long sec) {
        System.out.println("执行操作：延时关机。请及时保存所有内容，" + sec + "秒后将关机。");
        try {
            Thread.sleep(sec * 1000);
        } catch (InterruptedException ignore) {
            // 吞掉异常
        }
        System.out.println("时间到。关机中...");
    }
}
