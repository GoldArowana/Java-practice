package com.aries.learn.designpattern.adapter.adapterobject.impl2;

public interface CountEle<C, E> {
    /**
     * 计算ele在collection里出现过多少次
     */
    int countEle(C collection, E ele);
}
