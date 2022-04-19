package com.leetcode.priorityqueue;

import java.util.PriorityQueue;

public class PriorityQueueQues {

  static PriorityQueue<Integer> priorityQueue = new PriorityQueue<>((a, b) -> b-a);

  public static void main(String[] args) {
    priorityQueue.add(1);
    priorityQueue.poll();
  }

}
