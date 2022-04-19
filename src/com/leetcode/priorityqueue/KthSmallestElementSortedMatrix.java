package com.leetcode.priorityqueue;

import java.util.PriorityQueue;

public class KthSmallestElementSortedMatrix {

  public int kthSmallest(int[][] matrix, int k) {
    if(matrix== null || matrix.length<1) return -1;
    PriorityQueue<Integer> q = new PriorityQueue<>();
    for(int[] x : matrix)
      for(int v: x)
        q.offer(v);

    while(--k > 0)
      q.poll();

    return q.poll();

  }

}
