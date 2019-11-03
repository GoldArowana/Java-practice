package com.aries.learn;

import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class AppTest {
    private String getIp() throws IOException {
        Properties conf = new Properties();
        InputStream in = AppTest.class.getClassLoader().getResourceAsStream("conf.properties");
        conf.load(in);
        return conf.getProperty("redis-ip");
    }

    private int getPort() throws IOException {
        Properties conf = new Properties();
        InputStream in = AppTest.class.getClassLoader().getResourceAsStream("conf.properties");
        conf.load(in);
        return Integer.parseInt(conf.getProperty("redis-port"));
    }


    @Test
    public void shouldAnswerWithTrue() throws IOException {

    }
}
