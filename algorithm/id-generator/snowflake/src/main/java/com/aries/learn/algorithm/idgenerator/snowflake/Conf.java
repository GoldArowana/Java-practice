package com.aries.learn.algorithm.idgenerator.snowflake;

import lombok.Getter;

/**
 * @author arowana
 */
public class Conf {
    /**
     * 2019/12/01 0:0:0
     */
    public static final long START_STAMP = 1575129600000L;

    /**
     * 机器id所占的位数
     */
    public static final long WORKER_ID_BITS = 5L;

    /**
     * 最大的机器id。这个算法可以快速计算出n位二进制数对应的最大十进制数
     * workerIDBits为5的时候, 这里的值为31
     */
    public static final long MAX_WORKER_ID = ~(-1L << WORKER_ID_BITS);

    /**
     * 集群id所占的位数
     */
    public static final long DATA_CENTER_ID_BITS = 5L;

    /**
     * 最大的集群id。这个算法可以快速计算出n位二进制数对应的最大十进制数
     * dataCenterIDBits为5的时候, 这里的值为31
     */
    public static final long MAX_DATA_CENTER_ID = ~(-1L << DATA_CENTER_ID_BITS);

    /**
     * 自增序列在整个id中所占的位数
     */
    public static final long SEQUENCE_BITS = 12L;

    /**
     * 12位自增序列所能表示的最大值。这里是4095
     */
    public static final long MAX_SEQUENCE_ID = ~(-1L << SEQUENCE_BITS);
    /**
     * 机器id向左移12位
     */
    public static final long WORKER_ID_SHIFT = SEQUENCE_BITS;

    /**
     * 数据集群id向左移17位
     */
    public static final long DATA_CENTER_ID_SHIFT = SEQUENCE_BITS + WORKER_ID_BITS;

    /**
     * 时间戳向左移22位
     */
    public static final long TIME_STAMP_LEFT_SHIFT = SEQUENCE_BITS + WORKER_ID_BITS + DATA_CENTER_ID_BITS;
}
