package com.aries.learn.spring4.ioc_6;

/**
 * 用于演示bean声明周期
 */
public class LifeCycleBean {
    public LifeCycleBean() {
        System.out.println("LifeCycleBean 构造器被调用了");
    }

    /**
     * 构造方法调用后执行此方法
     */
    public void init() {
        System.out.println("LifeCycleBean 初始化方法-构造器调用后执行");
    }

    /**
     * 业务方法
     */
    public void save() {
        System.out.println("执行了save方法");
    }

    /**
     * bean销毁前调用此方法
     */
    public void destroy() {
        System.out.println("LifeCycleBean -destory 销毁前调用");
    }
}
