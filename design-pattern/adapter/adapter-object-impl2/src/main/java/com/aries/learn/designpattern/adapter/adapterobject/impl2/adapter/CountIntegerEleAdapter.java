package com.aries.learn.designpattern.adapter.adapterobject.impl2.adapter;

import com.aries.learn.designpattern.adapter.adapterobject.impl2.CountEle;
import com.aries.learn.designpattern.adapter.adapterobject.impl2.CountStringEleUtil;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class CountIntegerEleAdapter implements CountEle<Integer, Integer> {
    CountStringEleUtil countStringEleUtil;

    @Override
    public int countEle(Integer collection, Integer ele) {
        if (collection == null || ele == null || ele < 0 || ele > 10) {
            throw new RuntimeException("入参有问题，CountIntegerEleAdapter");
        }
        return countStringEleUtil.countEle(collection.toString(), (char) (ele + 48));
    }
}
