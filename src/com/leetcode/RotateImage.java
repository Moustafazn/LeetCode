package com.leetcode;

public class RotateImage {

  public static void rotate(int[][] matrix) {

    for (int i = 0; i < matrix.length; i++) {
      for (int j = i+1; j < matrix[0].length; j++) {
          int temp1 = matrix[i][j];
          matrix[i][j] = matrix[j][i];
          matrix[j][i] = temp1;
      }
    }

    for (int i = 0; i < matrix.length; i++) {
      int x = matrix[0].length-1;
      int j = 0;
      while(j < x) {
        int temp1 = matrix[i][j];
        matrix[i][j] = matrix[i][x];
        matrix[i][x] = temp1;
        j++; x--;
      }
    }
  }

  public static void main(String[] args) {
    int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
    rotate(matrix);

  }

}
