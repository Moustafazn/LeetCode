package com.leetcode.dfs;

import java.util.Arrays;

public class SurroundedRegions {
  public static void solve(char[][] board) {
    boolean visited[][] = new boolean[board.length][board[0].length];
    dfs(0,0, board, visited);
    for (int i = 0; i < board.length; i++) {
      for (int j = 0; j < board[i].length; j++)
        if(board[i][j]!='X' && visited[i][j]){
          board[i][j]='X';
        }
    }
  }

  static void dfs(int i, int j, char[][] graph, boolean visited[][]){
    if(i<0 || i>= graph.length || j<0 || j>= graph[i].length||
        graph[i][j]!='O' || visited[i][j])
      return;
    visited[i][j]=true;

    dfs(i-1, j, graph, visited);
    dfs(i+1, j, graph, visited);
    dfs(i, j-1, graph, visited);
    dfs(i, j+1, graph, visited);
  }

  public static void main(String[] args) {
    char[][] x = {{'X','X','X','X'},{'X','O','O','X',},{'X','X','O','X'},{'X','O','X','X'}};
    solve(x);
    System.out.println(Arrays.stream(x));
  }

}
