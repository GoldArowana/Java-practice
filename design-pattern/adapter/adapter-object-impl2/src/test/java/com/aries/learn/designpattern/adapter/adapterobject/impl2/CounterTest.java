package com.aries.learn.designpattern.adapter.adapterobject.impl2;

import com.aries.learn.designpattern.adapter.adapterobject.impl2.adapter.CountIntegerEleAdapter;
import lombok.var;
import org.junit.Test;

public class CounterTest {

    @Test
    public void StringCountTest() {
        var countEle = new CountStringEleUtil();
        System.out.println(countEle.countEle("1212322", '2'));
    }

    @Test
    public void IntegerCountTest() {
        // 这里有一个能够处理String中查找char类型的工具类
        var countStringEleUtil = new CountStringEleUtil();

        //用适配器模式适配一下，就可以处理Integer类型中查找Integer了
        var countEle = new CountIntegerEleAdapter(countStringEleUtil);
        System.out.println(countEle.countEle(210110, 1));
    }
}
