package com.leetcode.bfs;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Matrix01 {
  public int[][] updateMatrix(int[][] matrix) {
    if (matrix == null || matrix.length == 0 || matrix[0].length == 0)
      return matrix;

    final int N = matrix.length, M = matrix[0].length;

    int[][] distance = new int[N][M];

    bfs(matrix, distance);

    return distance;
  }
  private class Cell {
    int i, j;
    Cell(int i, int j) {
      this.i = i; this.j = j;
    }
  }
  void bfs(int[][] matrix, int[][] distance) {
    final int INF = Integer.MAX_VALUE;
    for (int i = 0; i < distance.length; i++)
      Arrays.fill(distance[i], INF);

    Queue<Cell> queue = new LinkedList<>();
    for (int i = 0; i < matrix.length; i++)
      for (int j = 0; j < matrix[i].length; j++)
        if (matrix[i][j] == 0) {
          distance[i][j] = 0;
          queue.add(new Cell(i, j));
        }

    while (!queue.isEmpty()) {
      Cell cell = queue.poll();

      final int[] di = {-1, 1, 0, 0};
      final int[] dj = {0, 0, -1, 1};

      for (int k = 0; k < 4; k++) {
        int i = cell.i + di[k], j = cell.j + dj[k];
        if (i < 0 || i >= matrix.length || j < 0 || j >= matrix[i].length)
          continue;

        if (distance[i][j] == INF) {
          distance[i][j] = distance[cell.i][cell.j] + 1;
          queue.add(new Cell(i, j));
        }
      }
    }
  }
}
