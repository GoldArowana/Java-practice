package com.aries.learn.designpattern.builder.simple.without;

import org.junit.Test;


public class HTMLMakerTest {

    @Test
    public void test1() {
        HTMLMaker maker = new HTMLMaker("新华日报", "欢度国庆", new String[]{"长假", "堵车", "人山人海"});
        System.out.println(maker.make());
    }
}
