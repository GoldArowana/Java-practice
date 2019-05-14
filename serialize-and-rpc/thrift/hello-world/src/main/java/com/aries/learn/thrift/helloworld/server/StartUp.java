package com.aries.learn.thrift.helloworld.server;

import com.aries.learn.thrift.helloworld.contract.service.UserLoginService;
import com.aries.learn.thrift.helloworld.server.serviceimpl.UserLoginServiceImpl;
import org.apache.thrift.server.TServer;
import org.apache.thrift.server.TSimpleServer;
import org.apache.thrift.transport.TServerSocket;
import org.apache.thrift.transport.TTransportException;

public class StartUp {
    public static void main(String[] args) throws TTransportException {
        UserLoginService.Iface userLoginService = new UserLoginServiceImpl();
        UserLoginService.Processor processor = new UserLoginService.Processor<>(userLoginService);

        TServer server = new TSimpleServer(new TServer.Args(new TServerSocket(4040)).processor(processor));

        server.serve();
    }
}
