package com.leetcode;

public class PeakIndexInMountainArray {
    public static int peakIndexInMountainArray(int[] arr) {
        if(arr.length<3) return -1;
        int l = 1;
        int r = arr.length -1;
        while(l<r){
            if(arr[l-1]<arr[l])
                l++;
            if(arr[r]>arr[r-1])
                r--;
        }
        return r-1;
    }
    public static void main(String[] args) {
        int[] x = {0,1,0};
        int [] y = {0,10,5,2};
        peakIndexInMountainArray(x);
        peakIndexInMountainArray(y);

    }

}
