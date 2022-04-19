package com.leetcode.priorityqueue;


import java.util.PriorityQueue;

public class MedianFinder {
  private PriorityQueue<Integer> firstHalf;
  private PriorityQueue<Integer> secondHalf;

  public MedianFinder() {
    firstHalf = new PriorityQueue<>((a, b) -> b - a);
    secondHalf = new PriorityQueue<>();
  }

  public void addNum(int num) {
    if (firstHalf.size() == 0 || num <= firstHalf.peek()) {
      firstHalf.add(num);
      if (firstHalf.size() > secondHalf.size() + 1)
        secondHalf.add(firstHalf.poll());
    } else {
      secondHalf.add(num);
      if (secondHalf.size() > firstHalf.size())
        firstHalf.add(secondHalf.poll());
    }
  }

  public double findMedian() {
    if (firstHalf.size() > secondHalf.size()) {
      return 1.0 * firstHalf.peek();
    } else {
      double sum = firstHalf.peek() + secondHalf.peek();
      return sum / 2;
    }
  }

  public static void main(String[] args) {
    MedianFinder obj = new MedianFinder();
    obj.addNum(1);
    obj.addNum(2);
    obj.addNum(3);
    obj.addNum(4);
    obj.addNum(5);
    obj.findMedian();
  }

}
