package com.leetcode.dfs;

public class NumberOfProvinces {

  public static int findCircleNum(int[][] isConnected) {
    boolean visited[] = new boolean[isConnected.length];
    int count = 0;
    for (int i = 0; i < isConnected.length; i++) {
      if(!visited[i]){
        count++;
        dfs(i, isConnected, visited);
      }
    }
   return count;
  }

  static void dfs(int node, int[][] graph, boolean[] visited){
    visited[node] = true;
    for (int i = 0; i < graph[node].length; i++)
      if(!visited[i] && graph[node][i]==1)
        dfs(i, graph, visited);
    }

  public static void main(String[] args) {
    int [][] isConnected = {{1,1,0},{1,1,0},{0,0,1}};
    System.out.println(findCircleNum(isConnected));
  }
  }


