package com.aries.learn.designpattern.composite.impl;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Department extends Composite {
    private String name;

    @Override
    public void printThis() {
        System.out.println("部门" + name);
    }
}
