package com.aries.learn.designpattern.bridge.impl;

import com.aries.learn.designpattern.bridge.impl.func.Display;
import com.aries.learn.designpattern.bridge.impl.func.MultiDisplay;
import com.aries.learn.designpattern.bridge.impl.impl.LinerPrinter;
import com.aries.learn.designpattern.bridge.impl.impl.SimplePrinter;
import org.junit.Test;


public class AppTest {

    @Test
    public void displayTest() {
        Display d = new Display(new SimplePrinter());
        d.display();
    }

    @Test
    public void LinerDisplayTest() {
        Display d = new Display(new LinerPrinter());
        d.display();
    }

    @Test
    public void MultiDisplayTest() {
        MultiDisplay d = new MultiDisplay(new SimplePrinter());
        d.mutiDisplay(3);
    }

    @Test
    public void MultiLinerDisplayTest() {
        MultiDisplay d = new MultiDisplay(new LinerPrinter());
        d.mutiDisplay(3);
    }
}
