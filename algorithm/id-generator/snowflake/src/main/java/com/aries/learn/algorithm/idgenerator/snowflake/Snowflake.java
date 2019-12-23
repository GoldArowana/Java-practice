package com.aries.learn.algorithm.idgenerator.snowflake;


import lombok.Getter;
import lombok.Setter;

/**
 * @author arowana
 */
@Getter
@Setter
public class Snowflake {
    private long workerId;

    private long dataCenterId;

    private long sequence = 0L;

    private long lastTimeStamp = -1L;

    public Snowflake(long workerId, long dataCenterId) {
        if (workerId > Conf.MAX_WORKER_ID || workerId < 0) {
            throw new IllegalArgumentException(String.format("workerId错误。 不能大于%d, 也不能小于0", Conf.MAX_WORKER_ID));
        } else if (dataCenterId > Conf.MAX_DATA_CENTER_ID || dataCenterId < 0) {
            throw new IllegalArgumentException(String.format("dataCenterId错误。 不能大于%d, 也不能小于0", Conf.MAX_DATA_CENTER_ID));
        }
        this.workerId = workerId;
        this.dataCenterId = dataCenterId;
    }

    public synchronized long nextId() {
        long nowTimeStamp = TimeUtils.getNowTime();

        //如果当前时间小于上一次ID生成的时间戳，说明系统时钟回退过。方案1: 抛出异常。 方案2: 自旋等待。
        if (nowTimeStamp < this.lastTimeStamp) {
            System.out.printf("系统时钟回滚过, 将在%d毫秒内停止对外提供id", this.lastTimeStamp - nowTimeStamp);
            TimeUtils.loopUntil(this.lastTimeStamp);
        }

        //如果是同一毫秒内生成过id，那么进行毫秒内序列自增。也就是sequence++ , 但是要模上MAX_SEQUENCE_ID
        if (nowTimeStamp == this.lastTimeStamp) {
            sequence = (sequence + 1) & Conf.MAX_SEQUENCE_ID;
            if (sequence == 0) {
                nowTimeStamp = TimeUtils.loopUntil(this.lastTimeStamp + 1);
            }
        } else { //同一毫秒内没有生成过id，序列号返回0。也就是说下一毫秒要把sequence清零。
            sequence = 0;
        }
        this.lastTimeStamp = nowTimeStamp;
        System.out.println(sequence);
        return ((nowTimeStamp - Conf.START_STAMP) << Conf.TIME_STAMP_LEFT_SHIFT)
                | (dataCenterId << Conf.DATA_CENTER_ID_SHIFT)
                | (workerId << Conf.WORKER_ID_SHIFT)
                | sequence;
    }
}
