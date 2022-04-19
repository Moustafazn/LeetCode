package com.leetcode.setsandmap;

import static java.util.stream.Collectors.toMap;

import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class TopKFrequentElements {

  public static int[] topKFrequent(int[] nums, int k) {
    if (nums == null || nums.length == 0)
      return new int[]{};
    Map<Integer, Integer> map = new HashMap<>();
    Map<Integer, Integer> sorted;
    for (int i = 0; i < nums.length; i++) {
      map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
    }
    sorted = map.entrySet().stream().sorted(Map.Entry.comparingByValue(Collections.reverseOrder()))
        .collect(toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e2,
            LinkedHashMap::new));

    int[] arr = new int[k];
    int count = 0;
    for (Entry<Integer, Integer> entry : sorted.entrySet()) {
      arr[count++] = entry.getKey();
      if (count == k)
        return arr;
    }
    return arr;
  }

  public static void main(String[] args) {
    int[] num = {1,1,1,2,2,3};
    System.out.println(topKFrequent(num, 2)[1]);
  }

}
