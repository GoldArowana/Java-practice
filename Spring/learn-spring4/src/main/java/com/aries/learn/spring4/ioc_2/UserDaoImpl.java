package com.aries.learn.spring4.ioc_2;

public class UserDaoImpl implements IUserDao {

    @Override
    public void findByUsernameAndPassword() {
        System.out.println("ioc2 - UserDaoImpl 中的findByUsernameAndPassword被调用了");
    }
}
