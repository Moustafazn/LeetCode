package com.leetcode.binarySearch;

public class BinarySearch {

  public static int binarySearch(int [] arr, int target){
    if (arr==null || arr.length==0)
      return -1;
    int l=0, r=arr.length-1;
    while(l<=r){
      int mid = (r+l)/2;
      if (arr[mid] ==target) return mid;
      else if (arr[mid] >target) r = mid-1;
      else l = mid+1;
    }

    return -1;
  }

  public static void main(String[] args) {
    final int[] a = {5, 7, 9, 13, 17, 22};
    System.out.println(binarySearch(a, 13)); // prints 3
    System.out.println(binarySearch(a, 15)); // -1
    System.out.println(binarySearch(a, 22)); // 5
    System.out.println(binarySearch(a, 5));  // 0
  }

}
