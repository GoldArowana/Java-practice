package com.aries.learn.designpattern.builder.simple;

public interface Builder {
    void makeTitle(String title);

    void makeParagraph(String paragraph);

    void makeItems(String[] items);

    String use();
}
