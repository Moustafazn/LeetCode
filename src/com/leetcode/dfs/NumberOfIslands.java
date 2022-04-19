package com.leetcode.dfs;

public class NumberOfIslands {

  public static void main(String[] args) {
   String[][] x = {{"1","1","1","1","0"},{"1","1","0","1","0"},{"1","1","0","0","0"},{"0","0","0","0","0"}};
   System.out.println(numIslands(x));
  }

  public static int numIslands(String[][] grid) {
    boolean[][] visited = new boolean[grid.length][grid[0].length];

    int count=0;
    for (int i = 0; i < grid.length; i++) {
      for (int j = 0; j < grid[i].length; j++)
        if(!visited[i][j] && grid[i][j].equals("1")){
        count++;
        dfs(i,j, grid, visited);
      }
    }
    return count;
  }


  static void dfs(int i, int j, String[][] graph, boolean[][] visited){
    if(i<0 || i>= graph.length || j<0 || j>= graph[i].length||
        !graph[i][j].equals("1")||visited[i][j])
      return;

    visited[i][j]=true;

    dfs(i-1, j, graph, visited);
    dfs(i+1, j, graph, visited);
    dfs(i, j-1, graph, visited);
    dfs(i, j+1, graph, visited);
  }

}
