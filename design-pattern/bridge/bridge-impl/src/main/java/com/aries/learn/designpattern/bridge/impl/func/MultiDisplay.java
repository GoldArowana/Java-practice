package com.aries.learn.designpattern.bridge.impl.func;

import com.aries.learn.designpattern.bridge.impl.impl.Printer;

public class MultiDisplay extends Display {
    public MultiDisplay(Printer printer) {
        super(printer);
    }

    public void mutiDisplay(int times) {
        for (int i = 0; i < times; i++) {
            display();
        }
    }
}
