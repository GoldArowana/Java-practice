package com.aries.learn.designpattern.prototype.impl;

import org.junit.Before;
import org.junit.Test;

public class PerformanceTest {

    @Before
    public void before() {
        PerformManager.reg("liu", new Performance("神奇卡牌魔术表演", "卡牌", "刘谦"));
    }

    @Test
    public void test1() {
        {
            Perform performance = PerformManager.getClone("liu");
            performance.showWith("董卿");
        }

        {
            Perform performance = PerformManager.getClone("liu");
            performance.showWith("路人");
        }

        {
            Perform performance = PerformManager.getClone("liu");
            performance.showWith("托儿");
        }

    }
}
