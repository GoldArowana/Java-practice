package com.aries.learn.spring4.ioc_5;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("ioc_5/applicationContext.xml");
        LifeCycleBean lifeCycleBean = (LifeCycleBean) applicationContext.getBean("lifeCycleBean");
        lifeCycleBean.save();

        // 关闭ApplicationContext， 内部单例对象销毁
        applicationContext.close();
    }
}
