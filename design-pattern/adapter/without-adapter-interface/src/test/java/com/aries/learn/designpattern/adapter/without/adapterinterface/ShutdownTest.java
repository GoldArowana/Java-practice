package com.aries.learn.designpattern.adapter.without.adapterinterface;

import org.junit.Test;


public class ShutdownTest {
    @Test
    public void TestMacOS() {
        MacOS macOS = new MacOS();
        macOS.shutdownImmediately();
    }

    @Test
    public void TestLenovo() {
        Lenovo lenovo = new Lenovo();
        lenovo.shutdownForcely();
    }

    @Test
    public void TestSamsung() {
        Samsung samsung = new Samsung();
        samsung.shutdownLater(2);
    }
}
