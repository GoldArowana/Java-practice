package com.aries.learn.designpattern.templatemethod.without;

import org.junit.Test;

public class DisplayTest {
    @Test
    public void TestCharDisplay() {
        CharDisplay charDisplay = new CharDisplay('H');
        charDisplay.before();
        charDisplay.print();
        charDisplay.after();
    }

    @Test
    public void TestStringDisplay() {
        StringDisplay stringDisplay = new StringDisplay("haha, hello");
        stringDisplay.before();
        stringDisplay.print();
        stringDisplay.after();
    }
}
