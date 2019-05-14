package com.aries.learn.designpattern.simplefactory.without;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class OperationTest {
    @Test
    public void testOp() throws Exception {
        Operation opt;

        {
            opt = new AddOperation();
            System.out.println(opt.getResult(3, 3));

            opt = new SubOperation();
            System.out.println(opt.getResult(3, 3));

            opt = new MultipliOperation();
            System.out.println(opt.getResult(3, 3));

            opt = new DivisionOperation();
            System.out.println(opt.getResult(3, 3));
        }
    }
}
