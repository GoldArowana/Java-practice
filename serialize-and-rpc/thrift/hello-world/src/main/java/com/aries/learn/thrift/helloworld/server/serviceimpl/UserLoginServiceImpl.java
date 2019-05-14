package com.aries.learn.thrift.helloworld.server.serviceimpl;

import com.aries.learn.thrift.helloworld.contract.dto.UserInfo;
import com.aries.learn.thrift.helloworld.contract.service.UserLoginService;
import org.apache.thrift.TException;

public class UserLoginServiceImpl implements UserLoginService.Iface {
    @Override
    public String ping() throws TException {
        System.out.println("接口到了ping");
        return "【pong】";
    }

    @Override
    public int add(int num1, int num2) throws TException {
        System.out.println("接收到了num1:" + num1 + ", num2:" + num2);
        return num1 + num2;
    }

    @Override
    public boolean login(UserInfo userInfo) throws TException {
        System.out.println("接收到了UserInfo:" + userInfo.getName() + "|" + userInfo.getAge());
        return true;
    }
}
