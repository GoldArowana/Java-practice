package com.aries.learn.designpattern.prototype.without;

import org.junit.Test;

public class PerformanceTest {
    @Test
    public void test1() {
        {
            Product performance = new Performance("神奇卡牌魔术表演", "卡牌", "刘谦");
            performance.showWith("董卿");
        }

        {   // 发现，构建相同参数的对象时，要把构造器参数一模一样地写出来...
            Product performance = new Performance("神奇卡牌魔术表演", "卡牌", "刘谦");
            performance.showWith("路人");
        }

        {   // 发现，构建相同参数的对象时，要把构造器参数一模一样地写出来...
            Product performance = new Performance("神奇卡牌魔术表演", "卡牌", "刘谦");
            performance.showWith("托儿");
        }

    }
}
