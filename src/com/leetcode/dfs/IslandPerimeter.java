package com.leetcode.dfs;

public class IslandPerimeter {

  public static int dfs(int i, int j, int[][] graph, boolean[][] visited) {
    if (i < 0 || i >= graph.length || j < 0 || j >= graph[i].length ||
        graph[i][j] == 0 )
      return 1;
    if(visited[i][j]) return 0;

    visited[i][j] = true;

    int left = dfs(i - 1, j, graph, visited);
    int right = dfs(i + 1, j, graph, visited);
    int deown = dfs(i, j - 1, graph, visited);
    int up = dfs(i, j + 1, graph, visited);
    return left + deown + right + up;
  }

  public static int islandPerimeter(int[][] grid) {
    boolean[][] visited = new boolean[grid.length][grid[0].length];

    for (int i = 0; i < grid.length; i++) {
      for (int j = 0; j < grid[i].length; j++)
        if (!visited[i][j] && grid[i][j] == 1) {
          return dfs(i, j, grid, visited);
        }
    }
    return 0;
  }

  public static void main(String[] args) {
    int[][] x = {{0, 1, 0, 0}, {1, 1, 1, 0}, {0, 1, 0, 0}, {1, 1, 0, 0}};
    System.out.println(islandPerimeter(x));
  }
}
