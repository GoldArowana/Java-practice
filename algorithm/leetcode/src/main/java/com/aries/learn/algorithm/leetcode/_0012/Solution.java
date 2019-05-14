package com.aries.learn.algorithm.leetcode._0012;

import java.util.ArrayList;
import java.util.List;

class Solution {
    private static class Conv {
        private int intValue;
        private String strValue;

        private Conv(int intValue, String strValue) {
            this.intValue = intValue;
            this.strValue = strValue;
        }
    }

    static final List<Conv> list = new ArrayList<>();

    static {
        list.add(new Conv(1000, "M"));
        list.add(new Conv(500, "D"));
        list.add(new Conv(100, "C"));
        list.add(new Conv(50, "L"));
        list.add(new Conv(10, "X"));
        list.add(new Conv(5, "V"));
        list.add(new Conv(1, "I"));
    }


    public String intToRoman(int num) {
        StringBuilder sb = new StringBuilder();

        for (Conv conv : list) {
            if (conv.intValue > num) continue;
            int times = num / conv.intValue;
            num = num % conv.intValue;

            for (int j = times; j > 0; j--) {
                sb.append(conv.strValue);
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(new Solution().intToRoman(4));
    }
}