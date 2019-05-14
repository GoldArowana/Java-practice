package com.aries.learn.designpattern.bridge.without;

public class MultiDisplay extends Display {
    public void multiDisplay(int times) {
        for (int i = 0; i < times; i++) {
            this.display();
        }
    }
}
