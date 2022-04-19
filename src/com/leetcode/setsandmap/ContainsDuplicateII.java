package com.leetcode.setsandmap;

import java.util.Arrays;
import java.util.HashMap;
import java.util.stream.Collectors;

public class ContainsDuplicateII {

  public static boolean containsNearbyDuplicate(int[] nums, int k) {
    if(nums==null || nums.length==0) return  false;
    HashMap<Integer, Integer> x = new HashMap<>();
    for (int i=0; i<nums.length; i++){
      if(x.containsKey(nums[i]) && x.get(nums[i])!= i && Math.abs(i-x.get(nums[i]))<=k)
        return true;
      else x.put(nums[i], i);
    }
    return false;


  }

  public static void main(String[] args) {
    int[] nums = {1,2,3,1,2,3};
    System.out.println(containsNearbyDuplicate(nums, 2));
  }

}
