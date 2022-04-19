package com.leetcode.bfs;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BFS {

  static void bfs(int node, List<List<Integer>>graph, int[] distance){
    int INF = Integer.MAX_VALUE;
    Arrays.fill(distance, INF);

    Queue<Integer> queue = new LinkedList<>();
    distance[node] = 0;
    queue.add(node);

    while (!queue.isEmpty()){
      int parent = queue.poll();
      for (int neighbor: graph.get(parent)) {
        if(distance[neighbor]==INF){
          queue.add(neighbor);
          distance[neighbor] = distance[parent] + 1;
        }
      }
    }
  }

  public static void main(String[] args) {
    final int N = 4;
    List<List<Integer>> graph = Arrays.asList(
        Arrays.asList(1, 2),
        Arrays.asList(0, 2, 3),
        Arrays.asList(0, 1),
        Arrays.asList(1)
    );

    int[] distance = new int[N];

    bfs(0, graph, distance);

    System.out.println(Arrays.toString(distance));
  }

}
