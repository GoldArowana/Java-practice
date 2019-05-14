package com.aries.learn.designpattern.bridge.impl.func;

import com.aries.learn.designpattern.bridge.impl.impl.Printer;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Display {
    private Printer printer;

    protected void before() {
        printer.printBefore();
    }

    protected void after() {
        printer.printAfter();
    }

    public void display() {
        before();
        printer.printSomething();
        after();
    }
}
