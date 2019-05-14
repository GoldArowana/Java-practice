package com.aries.learn.spring4.ioc_2;

public class UserServiceImpl implements IUserService {
    private IUserDao userDao;

    @Override
    public void login() {
        System.out.println("ioc2 - UserServiceImpl中的login被调用了");
        userDao.findByUsernameAndPassword();
    }

    public void setUserDao(IUserDao userDao) {
        this.userDao = userDao;
    }

    public IUserDao getUserDao() {
        return userDao;
    }
}
