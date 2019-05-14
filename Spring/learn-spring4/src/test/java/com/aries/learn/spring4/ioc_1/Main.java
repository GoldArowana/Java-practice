package com.aries.learn.spring4.ioc_1;

public class Main {
    public static void main(String[] args) {
        IUserService userService = new UserServiceImpl();
        userService.login();
    }
}
