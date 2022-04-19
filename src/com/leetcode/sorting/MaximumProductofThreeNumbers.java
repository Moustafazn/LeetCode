package com.leetcode.sorting;

import java.util.Arrays;

public class MaximumProductofThreeNumbers {


  public int maximumProduct(int[] nums) {
    if(nums.length<2) return nums[0];
    else if (nums.length<3) return nums[0] * nums[1];
    Arrays.sort(nums);
    int positive = nums[nums.length - 3] * nums[nums.length - 2];
    int negative = nums[0] * nums[1];

    return Math.max(positive * nums[nums.length - 1], negative * nums[nums.length - 1]);
  }



}
