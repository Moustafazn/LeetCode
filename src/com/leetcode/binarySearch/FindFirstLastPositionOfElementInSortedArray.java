package com.leetcode.binarySearch;

public class FindFirstLastPositionOfElementInSortedArray {

  public static int[] searchRange(int[] nums, int target) {
    int[] res = {-1, -1};
    if (nums == null || nums.length == 0) {
      return res;
    }
    res[0] = getFirstIndex(nums, target);
    res[1] = getLastIndex(nums, target);

    return res;
  }

  private static int getFirstIndex(int[] nums, int target) {
    int l = 0, r = nums.length-1;
    int res = -1;
    while (l <= r) {
      int mid = (r + l) / 2;
      if (nums[mid] > target) {
        r = mid - 1;
      } else if  (nums[mid] == target) {
        res = mid;
        r = mid-1;
      } else {
        l = mid + 1;
      }
    }
    return res;
  }

  private static int getLastIndex(int[] nums, int target) {
    int l = 0, r = nums.length-1;
    int res = -1;
    while (l <= r) {
      int mid = (r + l) / 2;
      if (nums[mid] == target) {
        res = mid;
        l = mid+1;
      }
     else if (nums[mid] > target) {
        r = mid - 1;
      } else {
        l = mid + 1;
      }
    }
    return res;
  }
  public static void main(String[] args) {
    int arr[] = {5,7,7,8,8,10};
    int[] x = searchRange(arr, 8);
    System.out.println(x[0] + "   " + x[1]);
  }

}
