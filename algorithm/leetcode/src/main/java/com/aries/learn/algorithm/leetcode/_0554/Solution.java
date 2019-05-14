package com.aries.learn.algorithm.leetcode._0554;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {
    public int leastBricks(List<List<Integer>> wall) {
        Map<Integer, Integer> map = new HashMap<>();
        for (List<Integer> sub : wall) {
            int gap = 0;
            for (int i = 0, len = sub.size() - 1; i < len; i++) {
                gap += sub.get(i);

                if (!map.containsKey(gap)) {
                    map.put(gap, 1);
                } else {
                    Integer v = map.get(gap);
                    map.put(gap, v + 1);
                }
            }
        }

        int max = 0;

        for (Integer integer : map.values()) {
            if (integer > max) max = integer;
        }
        return wall.size() - max;
    }
}