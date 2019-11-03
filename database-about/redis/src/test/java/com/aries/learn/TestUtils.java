package com.aries.learn;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class TestUtils {
    public static String getRedisIp() throws IOException {
        Properties conf = new Properties();
        InputStream in = StringTest.class.getClassLoader().getResourceAsStream("conf.properties");
        if (in == null) {
            in = StringTest.class.getClassLoader().getResourceAsStream("conf-example.properties");
        }
        conf.load(in);
        return conf.getProperty("redis-ip");
    }

    public static int getRedisPort() throws IOException {
        Properties conf = new Properties();
        InputStream in = StringTest.class.getClassLoader().getResourceAsStream("conf.properties");
        if (in == null) {
            in = StringTest.class.getClassLoader().getResourceAsStream("conf-example.properties");
        }
        conf.load(in);
        return Integer.parseInt(conf.getProperty("redis-port"));
    }
}
