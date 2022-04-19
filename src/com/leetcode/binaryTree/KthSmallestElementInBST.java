package com.leetcode.binaryTree;

import java.util.ArrayList;
import java.util.List;

public class KthSmallestElementInBST {

  public int kthSmallest(TreeNode root, int k) {
    if(root== null) return 0;
    List<Integer> list = inorderTraversal(root);
    if(list.size()>k) return list.get(k);
    return 0;
  }

  public List<Integer> inorderTraversal(TreeNode root) {
    List<Integer> list = new ArrayList<Integer>();
    if(root == null) return list;
    list.addAll(inorderTraversal(root.left));
    list.add(root.val);
    list.addAll(inorderTraversal(root.right));

    return list;
  }

  public static void main(String[] args) {

  }
}
