package com.leetcode.linkedList;

public class MergeTwoSortedLists {

  public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

  //Recursion
  public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
    if (list1 == null)
      return list2;
    if (list2 == null)
      return list1;
    if (list1.val < list2.val) {
      list1.next = mergeTwoLists(list1.next, list2);
      return list1;
    } else {
      list2.next = mergeTwoLists(list1, list2.next);
      return list2;
    }
  }

    //iterative
    public ListNode mergeTwoLists1(ListNode list1, ListNode list2) {
      ListNode ans = new ListNode();
      ListNode curr = ans;
      ListNode f = list1;
      ListNode s = list2;
      while(f != null && s != null){
        if(f.val < s.val){
          curr.next = f;
          f = f.next;
        }else{
          curr.next = s;
          s = s.next;
        }
        curr = curr.next;
      }
      while(f!=null){
        curr.next = f;
        f = f.next;
        curr = curr.next;
      }
      while(s!=null){
        System.out.println(s.val);
        curr.next = s;
        s = s.next;
        curr = curr.next;
      }
      return ans.next;
    }
}
