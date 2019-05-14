package com.aries.learn.designpattern.adapter.adapterobject.impl2;

public class CountStringEleUtil implements CountEle<String, Character> {

    public int countEle(String content, Character ele) {
        if (content == null || ele == null) {
            return 0;
        }
        int counter = 0;
        for (int i = 0; i < content.length(); i++) {
            char c = content.charAt(i);
            if (c == ele) counter++;
        }
        return counter;
    }
}
