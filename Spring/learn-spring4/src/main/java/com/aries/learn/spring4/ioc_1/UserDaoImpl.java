package com.aries.learn.spring4.ioc_1;

public class UserDaoImpl implements IUserDao {

    @Override
    public void findByUsernameAndPassword() {
        System.out.println("ioc1 - UserDaoImpl 中的findByUsernameAndPassword被调用了");
    }
}
