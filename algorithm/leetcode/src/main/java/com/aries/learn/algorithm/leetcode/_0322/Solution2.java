package com.aries.learn.algorithm.leetcode._0322;

import java.util.Arrays;

// 7ms
public class Solution2 {

    int min = Integer.MAX_VALUE;

    public int coinChange(int[] coins, int amount) {
        Arrays.sort(coins);
        process(coins, amount, 0, coins.length - 1);
        return min == Integer.MAX_VALUE ? -1 : min;
    }

    public void process(int[] coins, int amount, int count, int index) {
        if (index < 0 || count + amount / coins[index] >= min)
            return;
        if (amount % coins[index] == 0) {
            min = Math.min(min, count + amount / coins[index]);
            return;
        }
        for (int i = amount / coins[index]; i >= 0; i--) {
            process(coins, amount - coins[index] * i, count + i, index - 1);
        }
    }
}
