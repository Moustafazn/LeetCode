package com.leetcode;

import java.util.Arrays;

public class MaximumAverageSubarrayI {

  public static double findMaxAverage(int[] nums, int k) {
   double sum = 0;
    for (int i = 0; i < k; i++)
      sum += nums[i];
    double max = sum;
    for (int i = k; i < nums.length; i++) {
       sum = sum - nums[i - k] + nums[i];
      max = Math.max(sum, sum);
    }
    return max/  k;
  }
  public static void main(String[] args) {
    int nums[] = {0,1,1,3,3};
    System.out.println(findMaxAverage(nums, 4));
  }

}
