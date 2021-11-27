package kthDistinctStringInArray;

import java.util.LinkedHashMap;

class Solution {
    public String kthDistinct(String[] arr, int k) {
        var strings = new LinkedHashMap<String, Integer>();
        for (var s : arr) {
            strings.put(s, strings.getOrDefault(s, 0) + 1);
        }
        var n = 1;
        for (var pair : strings.entrySet()) {
            if (pair.getValue() == 1) {
                if (n == k) {
                    return pair.getKey();
                }
                n++;
            }
        }
        return "";
    }
}
