package com.aries.learn.designpattern.builder.simple;

import org.junit.Test;


public class BuilderTest {

    @Test
    public void testHtml() {
        HTMLBuilder builder = new HTMLBuilder();
        builder.makeTitle("XX日报");
        builder.makeParagraph("欢度国庆");
        builder.makeItems(new String[]{"堵车", "小长假"});
        System.out.println(builder.use());
    }
}
