package com.aries.learn.algorithm.idgenerator.snowflake;

public class TestSnowFlake {
    public static void main(String[] args) {
        Snowflake idWorker = new Snowflake(0, 0);
        for (int i = 0; i < 1000; i++) {
            long id = idWorker.nextId();
            System.out.println(Long.toBinaryString(id));
            System.out.println(id);
        }
    }
}
