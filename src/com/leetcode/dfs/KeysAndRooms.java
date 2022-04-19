package com.leetcode.dfs;

import java.util.List;

public class KeysAndRooms {

  public void dfs(int node, List<List<Integer>> rooms, boolean[] visited){
    visited[node] = true;

    for (int room: rooms.get(node)){
      if(!visited[room])
        dfs(room, rooms, visited);
    }
  }

  public boolean canVisitAllRooms(List<List<Integer>> rooms) {
    boolean[] visited = new boolean[rooms.size()];

    dfs(0, rooms, visited);

    for (boolean room: visited){
      if(!room) return false;
    }
    return true;
  }

  public static void main(String[] args) {

  }

}
