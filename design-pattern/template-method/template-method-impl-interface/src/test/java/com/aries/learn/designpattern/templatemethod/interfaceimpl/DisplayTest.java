package com.aries.learn.designpattern.templatemethod.interfaceimpl;

import org.junit.Test;

public class DisplayTest {
    @Test
    public void TestCharDisplay() {
        CharDisplay charDisplay = new CharDisplay('H');
        charDisplay.display();
    }

    @Test
    public void TestStringDisplay() {
        StringDisplay stringDisplay = new StringDisplay("haha, hello");
        stringDisplay.display();
    }
}
