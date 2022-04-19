package com.leetcode.TwoPointers;

public class TwoSumIIInputArrayIsSorted {
  public int[] twoSum(int[] numbers, int target) {
    if(numbers==null || numbers.length==0) return new int[]{};

    int l = 0, r = numbers.length - 1;
    while (l < r) {
      int sum = numbers[l] + numbers[r];
      if(sum== target) return new int[]{l, r};
      else if (sum>target) r--;
      else if (sum<target) l++;
    }
   return new int[]{};
  }
}
