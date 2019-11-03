package com.aries.learn;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import redis.clients.jedis.Jedis;

import java.io.IOException;

public class StringTest {

    private Jedis jedis;

    @Before
    public void init() throws IOException {
        String redisIp = TestUtils.getRedisIp();
        int redisPort = TestUtils.getRedisPort();
        jedis = new Jedis(redisIp, redisPort, 500);
    }

    @Test
    public void setIntTest() {
        System.out.println(jedis.set("age", "14"));
        System.out.println(jedis.get("age"));
        System.out.println(jedis.type("age"));
    }

    @Test
    public void incrTest() {
        System.out.println(jedis.incr("age"));
        System.out.println(jedis.get("age"));
        System.out.println(jedis.type("age"));
    }

    @Test
    public void appendTest() {
        System.out.println(jedis.append("s1", "hello "));
        System.out.println(jedis.append("s1", "world!"));
        System.out.println(jedis.get("s1"));
    }

    @Test
    public void setRange() {
        jedis.set("s1", "hello world!");
        System.out.println(jedis.get("s1"));
        System.out.println(jedis.setrange("s1", 6, "W"));
        System.out.println(jedis.get("s1"));
    }

    @Test
    public void substr() {
        jedis.set("s1", "hello world!");
        System.out.println(jedis.substr("s1", 3, 7));
    }

    @Test
    public void setBit() {
        System.out.println(jedis.setbit("s2", 2, true)); // 会返回二进制位被设置之前的值
        System.out.println(jedis.setbit("s2", 7, true)); // 会返回二进制位被设置之前的值
        System.out.println(jedis.get("s2"));
    }

    @Test
    public void keysTest() {
        jedis.set("hello", "world");
        jedis.set("haha", "heihei");
        jedis.set("aaa", "bbb");
        System.out.println(jedis.keys("*"));
    }

    @After
    public void destroy() {
        jedis.flushDB();
        jedis.close();
    }
}
