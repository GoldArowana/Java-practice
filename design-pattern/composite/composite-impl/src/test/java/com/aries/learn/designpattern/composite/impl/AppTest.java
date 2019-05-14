package com.aries.learn.designpattern.composite.impl;

import org.junit.Test;


public class AppTest {

    @Test
    public void test1() {
        Company f = new Company("k集团");
        Company a = new Company("a有限公司");
        Company b = new Company("b有限公司");
        f.add(a);
        f.add(b);

        Department a1 = new Department("a公司的部门1");
        Department a2 = new Department("a公司的部门2");
        a.add(a1);
        a.add(a2);

        Department b1 = new Department("b公司的部门1");
        b.add(b1);

        Department a11 = new Department("a公司的部门1的第1分队");
        Department a12 = new Department("a公司的部门1的第2分队");
        a1.add(a11);
        a1.add(a12);

        f.printThisAndChildren();
    }
}
