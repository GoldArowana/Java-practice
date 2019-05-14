package com.aries.learn.thrift.helloworld;

import com.aries.learn.thrift.helloworld.contract.dto.UserInfo;
import org.apache.thrift.protocol.TBinaryProtocol;
import org.apache.thrift.transport.TIOStreamTransport;
import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class TestSerial {
    @Test
    public void testWrite() throws Exception {
        UserInfo userInfo = new UserInfo();
        userInfo.setName("king");
        userInfo.setAge(20);
        FileOutputStream fos = new FileOutputStream(new File("pair.txt"));
        userInfo.write(new TBinaryProtocol(new TIOStreamTransport(fos)));
        fos.close();
    }

    @Test
    public void testRead() throws Exception {
        UserInfo userInfo = new UserInfo();
        FileInputStream fis = new FileInputStream(new File("pair.txt"));
        userInfo.read(new TBinaryProtocol(new TIOStreamTransport(fis)));
        System.out.println("name => " + userInfo.getName());
        System.out.println("age => " + userInfo.getAge());
        fis.close();
    }
}
