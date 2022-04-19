package com.leetcode.setsandmap;

import java.util.HashMap;

public class TwoSum {
  public static int[] twoSum(int[] nums, int target) {
   if(nums==null || nums.length==0) return  new int[]{};
    HashMap<Integer, Integer> map = new HashMap<>();
    for (int i = 0; i < nums.length; i++) {
      if(map.containsKey(target-nums[i]))
        return new int[]{map.get(target-nums[i]), i};
      if(!map.containsKey(nums[i])) map.put(nums[i], i);
    }
    return new int[]{};

  }

  public static void main(String[] args) {

  }

}
