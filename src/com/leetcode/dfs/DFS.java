package com.leetcode.dfs;

import java.util.HashSet;
import java.util.List;
import java.util.Stack;

public class DFS {

  void dfs(int node, List<List<Integer>> graph, boolean[] visited){
    visited[node] = true;
    for (int neighbour: graph.get(node)) {
      if(!visited[neighbour])
        dfs(neighbour, graph, visited);
    }

  }

  boolean dfsWithoutArray(List<List<Integer>> graph) {
    HashSet<Integer> visited = new HashSet<>();
    Stack<Integer> stack = new Stack<>();
    stack.push(0);

    while (!stack.isEmpty()) {
      for (int neighbour : graph.get(stack.pop())) {
        if (!visited.contains(neighbour)) {
          stack.push(neighbour);
          visited.add(neighbour);
        }
      }
    }
    return visited.size() == graph.size();
  }

}
