package com.aries.learn.spring4.ioc_2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("ioc_2/applicationContext.xml");
        IUserService userService = (IUserService) applicationContext.getBean("userService");
        userService.login();
    }
}
