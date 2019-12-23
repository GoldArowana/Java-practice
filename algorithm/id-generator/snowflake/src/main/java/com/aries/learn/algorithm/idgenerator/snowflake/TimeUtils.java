package com.aries.learn.algorithm.idgenerator.snowflake;

/**
 * @author arowana
 */
public class TimeUtils {
    static long loopUntil(long timeStamp) {
        for (long nowTimeStamp = getNowTime(); nowTimeStamp < timeStamp; nowTimeStamp = getNowTime()) ;

        return getNowTime();
    }

    static long getNowTime() {
        return System.currentTimeMillis();
    }
}
