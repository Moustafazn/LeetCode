package com.leetcode.binarySearch;

import java.util.Arrays;

public class FindDuplicateNumber {
  public static int findDuplicate(int[] nums) {
    Arrays.sort(nums);

    int l=0, r=nums.length-1;
    while(l<=r){
      int mid = (r+l)/2;
      if (nums[mid] ==nums[mid-1]) return nums[mid];
      else if (nums[mid] > nums[mid-1]) r = mid-1;
      else l = mid+1;
    }

    return -1;
  }

  public static void main(String[] args) {
    int arr[] = {5,2,7,8,8,10};
    int xx = findDuplicate(arr);
    System.out.println(xx);
  }

}
