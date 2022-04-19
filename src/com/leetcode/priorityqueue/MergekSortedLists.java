package com.leetcode.priorityqueue;

import java.util.PriorityQueue;

public class MergekSortedLists {
  public ListNode mergeKLists(ListNode[] lists) {
    if(lists==null) return null;
    if(lists.length==1) return lists[0];

    PriorityQueue<Integer> integers = new PriorityQueue<>();

    for (ListNode node: lists) {
      while(node!= null){
        integers.add(node.val);
        node =  node.next;
      }
    }

    ListNode head = new ListNode(integers.poll());
    ListNode temp = head;

    while (!integers.isEmpty()){
      temp.next = new ListNode(integers.poll());
      temp = temp.next;
    }

    return head;
  }
}


