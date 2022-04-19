package com.leetcode;

import java.util.Arrays;

public class MissingNumber {

  public static int missingNumber(int[] nums) {

    int n = nums.length;
    return (n*(n+1))/2 - Arrays.stream(nums).sum();
  }

  public static void main(String[] args) {
    int nums [] = {0,1};
    System.out.println(missingNumber(nums));
  }

}
