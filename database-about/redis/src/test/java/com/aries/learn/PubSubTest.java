package com.aries.learn;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPubSub;

import java.io.IOException;

public class PubSubTest {
    private Jedis jedis;

    @Before
    public void init() throws IOException {
        String redisIp = TestUtils.getRedisIp();
        int redisPort = TestUtils.getRedisPort();
        jedis = new Jedis(redisIp, redisPort, 500);
    }

    @Test
    public void publisher() throws InterruptedException {
        for (int i = 0; i < 10; i++) {
            jedis.publish("ch1", "ppp" + i);
            Thread.sleep(1000);
        }
    }

    @Test
    public void pubsub() {
        MyPubSub myPubSub = new MyPubSub();
        jedis.subscribe(myPubSub, "ch1");
    }


    @After
    public void destroy() {
        jedis.flushDB();
        jedis.close();
    }


    static class MyPubSub extends JedisPubSub {
        // 取得订阅的消息后的处理
        @Override
        public void onMessage(String channel, String message) {
            System.out.println("[onMessage] channel: " + channel + ", message: " + message);
        }

        // 取得按表达式的方式订阅的消息后的处理
        @Override
        public void onPMessage(String pattern, String channel, String message) {
            System.out.println("[onPMessage] pattern: " + pattern + ", channel: " + channel + ", message: " + message);
        }

        // 初始化按表达式的方式订阅时候的处理
        @Override
        public void onPSubscribe(String pattern, int subscribedChannels) {
            System.out.println("[onPSubscribe] pattern: " + pattern + ", subscribedChannels: " + subscribedChannels);
        }

        // 取消按表达式的方式订阅时候的处理
        @Override
        public void onPUnsubscribe(String pattern, int subscribedChannels) {
            System.out.println("[onPUnsubscribe] pattern: " + pattern + ", subscribedChannels: " + subscribedChannels);
        }

        @Override
        public void onPong(String pattern) {
            super.onPong(pattern);
            System.out.println("[onPong] pattern: " + pattern);

        }

        // 初始化订阅时候的处理
        @Override
        public void onSubscribe(String channel, int subscribedChannels) {
            System.out.println("[onSubscribe] channel: " + channel + ", subscribedChannels: " + subscribedChannels);
        }

        // 取消订阅时候的处理
        @Override
        public void onUnsubscribe(String channel, int subscribedChannels) {
            System.out.println("[onUnsubscribe] channel: " + channel + ", subscribedChannels: " + subscribedChannels);

        }
    }
}

