package com.aries.learn.spring4.ioc_6;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("ioc_6/applicationContext.xml");
        LifeCycleBean lifeCycleBean = (LifeCycleBean) applicationContext.getBean("lifeCycleBean");
        lifeCycleBean.save();

//         关闭ApplicationContext， 内部单例对象销毁
        applicationContext.close();
    }
}
