package com.aries.learn.spring4.ioc_3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 实例化bean的4种方式
 */
public class Main {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("ioc_3/applicationContext.xml");

        Bean1 bean1 = (Bean1) applicationContext.getBean("bean1");
        System.out.println(bean1);

        Bean2 bean2 = (Bean2) applicationContext.getBean("bean2");
        System.out.println(bean2);

        Bean3 bean3 = (Bean3) applicationContext.getBean("bean3");
        System.out.println(bean3);

        Bean4 bean4 = (Bean4) applicationContext.getBean("bean4");
        System.out.println(bean4);
    }
}
