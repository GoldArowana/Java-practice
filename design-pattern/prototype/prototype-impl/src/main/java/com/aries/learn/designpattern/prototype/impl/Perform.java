package com.aries.learn.designpattern.prototype.impl;

public interface Perform extends Cloneable {
    void showWith(String ctx);

    Perform createClone();
}
