package com.aries.learn.spring4.ioc_4;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("ioc_4/applicationContext.xml");

        SingletonBean singletonBean1 = (SingletonBean) applicationContext.getBean("singletonBean");
        SingletonBean singletonBean2 = (SingletonBean) applicationContext.getBean("singletonBean");
        SingletonBean singletonBean3 = (SingletonBean) applicationContext.getBean("singletonBean");

        PrototypeBean prototypeBean1 = (PrototypeBean) applicationContext.getBean("prototypeBean");
        PrototypeBean prototypeBean2 = (PrototypeBean) applicationContext.getBean("prototypeBean");
        PrototypeBean prototypeBean3 = (PrototypeBean) applicationContext.getBean("prototypeBean");

    }
}
