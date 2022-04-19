package com.leetcode.setsandmap;

import java.util.HashMap;

public class Sum4 {

  public int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
    HashMap<Integer, Integer> map = new HashMap<>();
    for (int n: nums1)
      for (int m : nums2)
        map.put(m + n, map.getOrDefault(m + n, 0) + 1);
    int count =0;
    for (int n: nums3)
      for (int m : nums4)
        count+= map.getOrDefault(-(m + n), 0);
    return count;
  }

}
