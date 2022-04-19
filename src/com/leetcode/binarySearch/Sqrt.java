package com.leetcode.binarySearch;

public class Sqrt {

  public static int mySqrt(int x) {
    int l=0, r=x;
    int num =-1;
    while(l<=r){
      int mid = l + (r - l) / 2;
      int i = mid * mid;
      if (i ==x) {
        return mid;
      } else if  (i > x) {
        r = mid-1;
      }else {
        l = mid+1;
      }
    }

    return num;
  }

  public static void main(String[] args) {
      System.out.println(mySqrt(4));
  }

}
