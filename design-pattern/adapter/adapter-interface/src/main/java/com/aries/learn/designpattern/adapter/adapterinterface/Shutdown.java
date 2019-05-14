package com.aries.learn.designpattern.adapter.adapterinterface;

/**
 * 关闭操作接口
 */
public interface Shutdown {

    /**
     * 立即关闭
     */
    void shutdownImmediately();

    /**
     * 强制关闭
     */
    void shutdownForcely();

    /**
     * 优雅地关闭
     */
    void shutdownGracefully();

    /**
     * 过一会儿后关闭
     *
     * @param mills 毫秒数。经过mills毫秒时间以后进行关闭。
     */
    void shutdownLater(long mills);
}
