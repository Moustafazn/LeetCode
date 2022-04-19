package com.leetcode.dfs;

import java.util.ArrayList;
import java.util.List;

public class CourseSchedule {
  private enum NodeState {
    UNVISITED,
    VISITING,
    VISITED
  };
  public static boolean canFinish(int numCourses, int[][] prerequisites) {
    if (prerequisites == null || prerequisites.length == 0)
      return true;

    List<List<Integer>> graph = new ArrayList<>();
    for (int i = 0; i < numCourses; i++)
      graph.add(new ArrayList<>());

    for (int[] requirement : prerequisites)
      graph.get(requirement[0]).add(requirement[1]);

    NodeState[] state = new NodeState[numCourses];
    for (int i = 0; i < numCourses; i++)
      state[i] = NodeState.UNVISITED;

    for (int i = 0; i < numCourses; i++)
      if (state[i] == NodeState.UNVISITED)
        if (dfs(i, graph, state))
          return false;

    return true;
  }
  // returns true if the cycle was found
  private static boolean dfs(int node, List<List<Integer>> graph, NodeState state[]) {
    state[node] = NodeState.VISITING;
    boolean hasCycle = false;

    for (int neighbour : graph.get(node)) {
      if (state[neighbour] == NodeState.UNVISITED)
        hasCycle |= dfs(neighbour, graph, state);
      else if (state[neighbour] == NodeState.VISITING)
        hasCycle = true;
    }

    state[node] = NodeState.VISITED;
    return hasCycle;
  }

  public static void main(String[] args) {
    int [][] pre = {{1,0}, {0,1}};
    System.out.println(canFinish(2, pre));
  }

}
