package com.aries.learn.designpattern.simplefactory.impl;

import com.aries.learn.designpattern.simplefactory.impl.operation.*;

public class OperationFactory {

    // 简单工厂，根据字符串创建相应的对象
    public static Operation createOperation(String name) {
        switch (name) {
            case "+":
                return new AddOperation();
            case "-":
                return new SubOperation();
            case "*":
                return new MultipliOperation();
            case "/":
                return new DivisionOperation();
            default:
                throw new RuntimeException("根据操作【" + name + "】未获取到相应的操作！");
        }
    }
}