package com.leetcode.binarySearch;

public class MinimumElementRotatedSortedArray {

  public static int findMin(int[] nums) {
    if(nums==null || nums.length==0) return -1;

    int l = 0, r= nums.length-1;
    if(nums[l]<= nums[r]) return nums[l];

    while (l<=r){
      int mid = (l+r)/ 2;

      if(mid>0 && nums[mid]<nums[mid-1]) return nums[mid];
      if(mid<nums.length-1 && nums[mid]>nums[mid+1]) return nums[mid+1];

      if(nums[l]<=nums[mid])
        l = mid+1;
      else
        r = mid-1;
    }

    return -1;
  }


  public static void main(String[] args) {
    int nums[] = {4,5,6,7,0,1,2};
    System.out.println(findMin(nums));
  }

}
