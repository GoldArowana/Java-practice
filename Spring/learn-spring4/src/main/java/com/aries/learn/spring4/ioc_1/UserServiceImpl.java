package com.aries.learn.spring4.ioc_1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserServiceImpl implements IUserService {
    @Override
    public void login() {
        System.out.println("ioc1 - UserServiceImpl中的login被调用了");

        // 读取applicationContext.xml文件，然后获取bean
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("ioc_1/applicationContext.xml");
        IUserDao userDao = (IUserDao) applicationContext.getBean("userDao");
        userDao.findByUsernameAndPassword();
    }
}
