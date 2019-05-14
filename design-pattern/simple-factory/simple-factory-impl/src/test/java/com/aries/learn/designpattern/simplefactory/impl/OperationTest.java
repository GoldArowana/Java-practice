package com.aries.learn.designpattern.simplefactory.impl;

import com.aries.learn.designpattern.simplefactory.impl.operation.Operation;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class OperationTest {
    @Test
    public void testOp() throws Exception {
        Operation opt;

        {
            opt = OperationFactory.createOperation("+");
            System.out.println(opt.getResult(3, 3));

            opt = OperationFactory.createOperation("-");
            System.out.println(opt.getResult(3, 3));

            opt = OperationFactory.createOperation("*");
            System.out.println(opt.getResult(3, 3));

            opt = OperationFactory.createOperation("/");
            System.out.println(opt.getResult(3, 3));
        }
    }
}
