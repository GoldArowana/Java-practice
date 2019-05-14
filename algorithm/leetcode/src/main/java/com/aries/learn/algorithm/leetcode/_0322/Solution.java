package com.aries.learn.algorithm.leetcode._0322;

import java.util.HashMap;

// 355 ms
class Solution {
    HashMap<Integer, Integer> cache = new HashMap<>();

    public int coinChange(int[] coins, int amount) {
        return process(coins, amount);
    }

    public int process(int[] coins, int amount) {
        if (amount == 0) return 0;
        if (cache.containsKey(amount)) return cache.get(amount);

        int ans = Integer.MAX_VALUE;
        for (int coin : coins) {
            if (amount - coin < 0) continue;
            int subProb = process(coins, amount - coin);
            if (subProb != -1) {
                ans = Math.min(ans, subProb + 1);
            }
        }
        cache.put(amount, ans == Integer.MAX_VALUE ? -1 : ans);
        return cache.get(amount);
    }

    public static void main(String[] args) {
        System.out.println(new Solution().coinChange(new int[]{1, 2, 5}, 11));
    }
}