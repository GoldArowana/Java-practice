package com.aries.learn.designpattern.bridge.without;

import org.junit.Test;

/**
 * 想要实现这四种输出，就需要创建4个类。
 */
public class AppTest {
    @Test
    public void displayTest() {
        Display d = new Display();
        d.display();
    }

    @Test
    public void linerDisplayTest() {
        Display d = new LinerDisplay();
        d.display();
    }

    @Test
    public void MultiDisplayTest() {
        MultiDisplay d = new MultiDisplay();
        d.multiDisplay(3);
    }

    @Test
    public void MultiLinerDisplayTest() {
        MultiLinerDisplay d = new MultiLinerDisplay();
        d.multiDisplay(3);
    }
}
