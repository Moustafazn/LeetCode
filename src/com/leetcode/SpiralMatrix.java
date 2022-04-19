package com.leetcode;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {

  public static List<Integer> spiralOrder(int[][] matrix) {
    List<Integer> nums = new ArrayList<>();
    int iEnd=matrix[0].length-1, iStart= 0;
    int jEnd=matrix.length-1, jStart=0;
    int n = matrix.length * matrix[0].length;
    while (n>0){
      for (int i = iStart; i <= iEnd&& n>0; i++) {
        nums.add(matrix[iStart][i]);
        n--;
      }

      for (int j =jStart+1; j <=jEnd&& n>0; j++) {
        nums.add(matrix[j][iEnd]);
        n--;
      }

      for (int i = iEnd-1; i >= iStart&& n>0; i--) {
        nums.add(matrix[jEnd][i]);
        n--;
      }
      jStart++;
      for (int j = jEnd-1; j >= jStart&& n>0; j--) {
        nums.add(matrix[j][iStart]);
        n--;
      }
      iStart++;
      iEnd--;
      jEnd--;
    }

    return nums;
  }


  public static void main(String[] args) {
   int[][] nums = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
   // int[][] nums = {{1,2,3},{4,5,6},{7,8,9}};

   System.out.println(spiralOrder(nums));
  }

}
