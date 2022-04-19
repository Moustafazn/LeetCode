package com.leetcode.binarySearch;

public class FirstBadVersion {

  public int firstBadVersion(int n) {
    int l=0, r=n;
    int version =-1;
    while(l<=r){
      int mid = l + (r - l) / 2;
      boolean res = false;//isBadVersion(mid);
      if (res ==false) {
        l = mid + 1;
      } else if  (res ==true) {
        version = mid;
        r = mid-1;
      }
    }

    return version;
  }

  public static void main(String[] args) {

  }

}
