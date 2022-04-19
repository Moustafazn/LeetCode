package com.leetcode.TwoPointers;

public class SortColors {
  public void sortColors(int[] nums) {
    if(nums==null) return;

    int pointer  = 0;
    for (int i = 0; i < nums.length; i++) {
        if(nums[i]==0){
          int x = nums[pointer];
          nums[pointer] = nums[i];
          nums[i] = x;
          pointer++;
        }
    }
    int pointer2  = pointer;
    for (int i = pointer; i < nums.length; i++) {
      if(nums[i]==1){
        int x = nums[pointer2];
        nums[pointer2] = nums[i];
        nums[i] = x;
        pointer2++;
      }
    }
  }
}
