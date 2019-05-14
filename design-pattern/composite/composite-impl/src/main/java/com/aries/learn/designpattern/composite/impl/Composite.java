package com.aries.learn.designpattern.composite.impl;

import java.util.ArrayList;
import java.util.List;

public abstract class Composite {
    private List<Composite> children = new ArrayList<>();

    public void add(Composite composite) {
        children.add(composite);
    }

    public int count() {
        return children.size();
    }

    public abstract void printThis();

    public void printThisAndChildren() {
        printThis();
        for (int i = 0; i < count(); i++) {
            children.get(i).printThisAndChildren();
        }
    }
}
