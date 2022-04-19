package com.leetcode.setsandmap;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Sum3 {

  public List<List<Integer>> threeSum(int[] nums) {
    Arrays.stream(nums).boxed().collect(Collectors.toSet());
   return null;
  }

  public static void main(String[] args) {

  }

}
