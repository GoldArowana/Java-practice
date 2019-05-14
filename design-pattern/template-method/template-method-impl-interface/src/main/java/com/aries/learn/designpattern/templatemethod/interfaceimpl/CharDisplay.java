package com.aries.learn.designpattern.templatemethod.interfaceimpl;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class CharDisplay implements AbstractDisplay {
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
