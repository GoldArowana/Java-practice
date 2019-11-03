package com.aries.learn;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import redis.clients.jedis.Jedis;

import java.io.IOException;

public class SortedSetTest {
    private Jedis jedis;

    @Before
    public void init() throws IOException {
        String redisIp = TestUtils.getRedisIp();
        int redisPort = TestUtils.getRedisPort();
        jedis = new Jedis(redisIp, redisPort, 500);
    }

    @Test
    public void zAddTest() {
        jedis.zadd("zet1", 3, "aa");
        jedis.zadd("zet1", 5, "bb");
        jedis.zadd("zet1", 4, "cc");
        jedis.zadd("zet1", 3.5, "dd");
        System.out.println(jedis.zcard("zet1"));
        System.out.println(jedis.zrange("zet1", 0, -1));
    }

    @Test
    public void zIncrByTest() {
        jedis.zadd("zet1", 3, "aa");
        System.out.println(jedis.zscore("zet1", "aa"));

        System.out.println(jedis.zincrby("zet1", 2.0, "aa"));
        System.out.println(jedis.zscore("zet1", "aa"));
    }

    @Test
    public void zScoreTest() {
        jedis.zadd("zet1", 3, "aa");
        System.out.println(jedis.zscore("zet1", "aa"));
    }

    @Test
    public void zRankTest() {
        jedis.zadd("zet1", 3, "aa");
        jedis.zadd("zet1", 5, "bb");
        jedis.zadd("zet1", 4, "cc");
        jedis.zadd("zet1", 3.5, "dd");

        System.out.println(jedis.zrank("zet1", "aa")); // 小到大排列
        System.out.println(jedis.zrank("zet1", "bb"));
    }

    @Test
    public void zRevRankTest() {
        jedis.zadd("zet1", 3, "aa");
        jedis.zadd("zet1", 5, "bb");
        jedis.zadd("zet1", 4, "cc");
        jedis.zadd("zet1", 3.5, "dd");
        System.out.println(jedis.zrevrank("zet1", "aa")); // 大到小排列
    }

    @After
    public void destroy() {
        jedis.flushDB();
        jedis.close();
    }
}
