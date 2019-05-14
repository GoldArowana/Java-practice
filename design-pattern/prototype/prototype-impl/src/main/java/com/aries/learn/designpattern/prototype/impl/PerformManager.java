package com.aries.learn.designpattern.prototype.impl;

import java.util.HashMap;

public class PerformManager {
    private static HashMap<String, Perform> mangerMap = new HashMap<>();

    public static void reg(String key, Performance performance) {
        mangerMap.put(key, performance);
    }

    public static Perform getClone(String key) {
        Perform performance = mangerMap.get(key);
        if (performance == null) return null;
        return performance.createClone();
    }
}
