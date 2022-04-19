package com.leetcode.bfs;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class SurroundedRegions {
  private class Cell{
    int i;
    int j;

    Cell(int i, int j){
      this.i = i;
      this.j = j;
    }
  }

  public void solve(char[][] board) {
    int [][] distance = new int[board.length][board[0].length];
    bfs(board, distance);
    for (int i = 0; i < board.length; i++) {
      for (int j = 0; j < board[0].length; j++) {
        if (distance[i][j] == 0)
            board[i][j]='O';
        else board[i][j] = 'X';
      }
    }
  }

  public void bfs(char[][] board, int [][] distance){
    int INF = Integer.MAX_VALUE;
    Queue<Cell> queue = new LinkedList<>();

    for (int i = 0; i < board.length; i++) {
      Arrays.fill(distance[i], INF);
      for (int j = 0; j < board[0].length; j++) {
        if(board[i][j]=='O') {
          queue.add(new Cell(i, j));
          distance[i][j] = 0;
        }
      }
    }

    int[][] dir = {{-1, 0}, {1, 0}, {0,-1}, {0, 1}};
    while(!queue.isEmpty()){
      Cell node = queue.poll();
      for (int[] ints : dir) {
        int i = node.i + ints[0];
        int j = node.j + ints[1];
        if (i < 0 || i > board.length - 1 || j < 0 || j > board[0].length - 1)
          continue;
        if (distance[i][j] == INF || distance[i][j] == 0) {
          distance[i][j] = distance[node.i][node.j] + 1;
         if(distance[i][j] == INF)  queue.add(new Cell(i, j));
        }
      }
    }

  }

  public static void main(String[] args) {
    char[][] x = {{'X','X','X','X'},{'X','O','O','X',},{'X','X','O','X'},{'X','O','X','X'}};
    SurroundedRegions s = new SurroundedRegions();
    s.solve(x);
    for (int i = 0; i < x.length; i++) {
      System.out.println(Arrays.toString(x[i]));

    }
  }

}
