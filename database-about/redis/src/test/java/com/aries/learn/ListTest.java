package com.aries.learn;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import redis.clients.jedis.Jedis;

import java.io.IOException;

public class ListTest {
    private Jedis jedis;

    @Before
    public void init() throws IOException {
        String redisIp = TestUtils.getRedisIp();
        int redisPort = TestUtils.getRedisPort();
        jedis = new Jedis(redisIp, redisPort, 500);
    }

    @Test
    public void rPushTest() {
        System.out.println(jedis.rpush("list1", "aa"));// 返回插入后的list长度
        System.out.println(jedis.rpop("list1"));
    }

    @Test
    public void lRangeTest() {
        jedis.rpush("list1", "aa", "bb", "cc", "dd", "ee");
        System.out.println(jedis.lrange("list1", 0, 2));
        System.out.println(jedis.lrange("list1", 0, -1));
    }

    @Test
    public void lTrimTest() {
        jedis.rpush("list1", "aa", "bb", "cc", "dd", "ee");
        jedis.ltrim("list1", 2, -1);// 只保留list1中index>=2的
        System.out.println(jedis.lrange("list1", 0, -1));
    }

    @Test
    public void brPopTest() {
        System.out.println(jedis.brpop(5000, "list1"));
    }

    @Test
    public void push4brPopTest() {
        jedis.rpush("list1", "haha");
    }

    @After
    public void destroy() {
        jedis.flushDB();
        jedis.close();
    }
}
