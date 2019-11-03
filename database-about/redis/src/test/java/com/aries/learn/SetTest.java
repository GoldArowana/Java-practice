package com.aries.learn;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import redis.clients.jedis.Jedis;

import java.io.IOException;

public class SetTest {

    private Jedis jedis;

    @Before
    public void init() throws IOException {
        String redisIp = TestUtils.getRedisIp();
        int redisPort = TestUtils.getRedisPort();
        jedis = new Jedis(redisIp, redisPort, 500);
    }

    @Test
    public void sAddTest() {
        jedis.sadd("set1", "a", "b", "c", "d");
        System.out.println(jedis.scard("set1"));// 查看元素数量
        System.out.println(jedis.smembers("set1"));
    }

    @Test
    public void sRemTest() {
        jedis.sadd("set1", "a", "b", "c", "d");
        jedis.srem("set1", "a", "c");
        System.out.println(jedis.scard("set1"));
        System.out.println(jedis.smembers("set1"));
    }

    @Test
    public void sMoveTest() {
        jedis.sadd("set1", "a", "b", "c", "d");
        jedis.smove("set1", "set2", "a");// a存在于set1中，会把a从set1移到set2中
        System.out.println(jedis.smembers("set1"));
        System.out.println(jedis.smembers("set2"));
        jedis.smove("set1", "set2", "z");// z不存在于set1中，所以不会move到set2里
        System.out.println(jedis.smembers("set2"));
    }

    @Test
    public void sDiffTest() {
        jedis.sadd("set1", "a", "b", "c", "d");
        jedis.sadd("set2", "c", "d", "e", "f");
        System.out.println(jedis.sdiff("set1", "set2")); // set1 - set2
    }

    @Test
    public void sInterTest() {
        jedis.sadd("set1", "a", "b", "c", "d");
        jedis.sadd("set2", "c", "d", "e", "f");
        System.out.println(jedis.sinter("set1", "set2")); // set1 与 set2 交集
    }

    @Test
    public void sUnionTest() {
        jedis.sadd("set1", "a", "b", "c", "d");
        jedis.sadd("set2", "c", "d", "e", "f");
        System.out.println(jedis.sunion("set1", "set2")); // set1 + set2
    }

    @After
    public void destroy() {
        jedis.flushDB();
        jedis.close();
    }
}
