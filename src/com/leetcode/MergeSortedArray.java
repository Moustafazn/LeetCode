package com.leetcode;

import java.util.Arrays;

public class MergeSortedArray {

  public static void merge(int[] nums1, int m, int[] nums2, int n) {

    for (int i = nums1.length-1; i >=0; i--) {
      if(m>0&&n>0){
         if(nums1[m-1]>nums2[n-1]){   nums1[i] = nums1[m-1]; m--;}else{   nums1[i] = nums2[n-1]; n--;};
      }else if(m>0){
        nums1[i] = nums1[m-1];
        m--;
      }else if (n>0){
        nums1[i] = nums2[n-1];
        n--;
      }
    }
    System.out.println(Arrays.toString(nums1));
  }

  public static void main(String[] args) {
    int nums1[] = {1,2,3,0,0,0}, m = 3, nums2[] = {2,5,6}, n = 3;
    merge(nums1, m, nums2, n);
  }

}
