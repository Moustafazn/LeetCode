package com.leetcode.TwoPointers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Sum3 {
  //-4, -1, -1, 0,1,2,
  public static List<List<Integer>> threeSum(int[] nums) {
    if (nums==null || nums.length<3) return List.of();
    Set<List<Integer>> res = new HashSet<>();
    Arrays.sort(nums);
    int l = 0;
    int r =nums.length-1;
    while(l<r){
      int sum = nums[l] + nums[r] + nums[r - 1];
      if(sum == 0 && nums[l]!=0 && nums[r]!=0) {
        List<Integer> list = List.of(nums[l] , nums[r - 1], nums[r]);
        if(!res.contains(list))res.add(list);
        r--;
      }
      else if(sum<0) l++;
      else r--;
    }
    l = 0;
    r =nums.length-1;
    while(l<r){
      int sum = nums[l] + nums[l+1] + nums[r];
      if(sum == 0 && nums[l]!=0 && nums[r]!=0){
        List<Integer> list = List.of(nums[l] , nums[l+1] , nums[r]);
        if(!res.contains(list))res.add(list);
        l++;
      }
      else if(sum<0) l++;
      else r--;
    }
    return res.stream().collect(Collectors.toList());
  }

  public static void main(String[] args) {
    System.out.println(threeSum(new int[]{3,0,-2,-1,1,2}));
  }
}
