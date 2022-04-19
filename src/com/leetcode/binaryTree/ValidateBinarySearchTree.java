package com.leetcode.binaryTree;

public class ValidateBinarySearchTree {

  public boolean isValidBST(TreeNode root) {
    return validateBST(root, Long.MIN_VALUE, Long.MAX_VALUE);
  }
  private boolean validateBST(TreeNode root, long min, long max){
    if(root== null) return true;
    if(root.val<=min || root.val>=max)
      return false;
    return validateBST(root.left, min, Long.valueOf(root.val)) &&
        validateBST(root.right,Long.valueOf(root.val), max);
  }

}
