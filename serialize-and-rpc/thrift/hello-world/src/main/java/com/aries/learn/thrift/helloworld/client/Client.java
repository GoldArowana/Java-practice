package com.aries.learn.thrift.helloworld.client;

import com.aries.learn.thrift.helloworld.contract.dto.UserInfo;
import com.aries.learn.thrift.helloworld.contract.service.UserLoginService;
import org.apache.thrift.TException;
import org.apache.thrift.protocol.TBinaryProtocol;
import org.apache.thrift.protocol.TProtocol;
import org.apache.thrift.transport.TSocket;
import org.apache.thrift.transport.TTransport;

public class Client {
    public static void main(String[] args) throws TException {
        TTransport transport = new TSocket("localhost", 4040);
        transport.open();

        TProtocol protocol = new TBinaryProtocol(transport);
        UserLoginService.Client client = new UserLoginService.Client.Factory().getClient(protocol);

        System.out.println(client.ping());
        System.out.println(client.add(2, 4));
        System.out.println(client.login(new UserInfo("john", 12)));
    }
}
