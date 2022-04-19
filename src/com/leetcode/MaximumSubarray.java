package com.leetcode;

public class MaximumSubarray {

  public static int maxSubArray(int[] nums) {
    int max = Integer.MIN_VALUE;
    int curr = 0;
    for (int num : nums) {
      curr = Math.max(curr, curr + num);
      max = Math.max(curr, max);
    }
    return max;
  }

  public static void main(String[] args) {
    int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
    System.out.println(maxSubArray(nums));
  }

}
