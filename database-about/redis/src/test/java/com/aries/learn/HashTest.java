package com.aries.learn;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import redis.clients.jedis.Jedis;

import java.io.IOException;
import java.util.HashMap;

public class HashTest {
    private Jedis jedis;

    @Before
    public void init() throws IOException {
        String redisIp = TestUtils.getRedisIp();
        int redisPort = TestUtils.getRedisPort();
        jedis = new Jedis(redisIp, redisPort, 500);
    }

    @Test
    public void hmSetTest() {
        jedis.hmset("hash1", new HashMap<String, String>() {{
            put("age", "17");
            put("name", "king");
        }});

        System.out.println(jedis.hmget("hash1", "age", "name"));
    }

    @Test
    public void hLenTest() {
        jedis.hmset("hash1", new HashMap<String, String>() {{
            put("age", "17");
            put("name", "king");
        }});
        System.out.println(jedis.hlen("hash1"));
    }

    @Test
    public void hDelTest() {
        jedis.hmset("hash1", new HashMap<String, String>() {{
            put("age", "17");
            put("name", "king");
        }});
        jedis.hdel("hash1", "name");
        System.out.println(jedis.hkeys("hash1"));
    }

    @Test
    public void hExistsTest() {
        jedis.hmset("hash1", new HashMap<String, String>() {{
            put("age", "17");
            put("name", "king");
        }});
        System.out.println(jedis.hexists("hash1", "age"));
        System.out.println(jedis.hexists("hash1", "haha"));
    }


    @Test
    public void hIncrByTest() {
        jedis.hmset("hash1", new HashMap<String, String>() {{
            put("age", "17");
            put("name", "king");
        }});
        System.out.println(jedis.hincrBy("hash1", "age", 1L));
        System.out.println(jedis.hget("hash1", "age"));
    }

    @After
    public void destroy() {
        jedis.flushDB();
        jedis.close();
    }
}
