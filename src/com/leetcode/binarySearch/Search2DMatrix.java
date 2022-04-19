package com.leetcode.binarySearch;

public class Search2DMatrix {

  public static boolean searchMatrix(int[][] matrix, int target) {
    if (matrix==null || matrix.length==0)
      return false;
    for (int i=0; i<matrix.length; i++){
      int l=0, r=matrix[i].length-1;
      while(l<=r){
        int mid = (r+l)/2;
        if (matrix[i][mid] ==target) return true;
        else if (matrix[i][mid] >target) r = mid-1;
        else l = mid+1;
      }
    }
    return false;
  }

  public static void main(String[] args) {
    int nums[][] = {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
    System.out.println(searchMatrix(nums, 3));
  }

}
