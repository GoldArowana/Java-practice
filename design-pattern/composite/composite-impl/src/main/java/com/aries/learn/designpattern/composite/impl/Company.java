package com.aries.learn.designpattern.composite.impl;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Company extends Composite {
    private String name;

    @Override
    public void printThis() {
        System.out.println("公司：" + name);
    }
}
