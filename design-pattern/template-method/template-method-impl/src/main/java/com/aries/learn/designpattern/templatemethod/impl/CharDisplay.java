package com.aries.learn.designpattern.templatemethod.impl;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class CharDisplay extends AbstractDisplay {
    private char ch;

    @Override
    public void before() {
        System.out.print("<<");
    }

    @Override
    public void print() {
        System.out.print(ch);
    }

    @Override
    public void after() {
        System.out.print(">>\n");
    }
}
