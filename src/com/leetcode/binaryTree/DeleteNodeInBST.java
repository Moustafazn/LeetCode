package com.leetcode.binaryTree;

public class DeleteNodeInBST {

  public TreeNode deleteNode(TreeNode root, int key) {
    if(root== null) return null;
    if(root.val==key){
      if(root.left == null && root.right == null){ return null;}
      if(root.right == null) { return root.left;}
      if(root.left == null) {return root.right;}
      TreeNode traverse = root.right;
      while(traverse.left != null) {
        traverse = traverse.left;
      }
      traverse.left = root.left;
      return root.right;
    }else if(root.val>key){
      root.left = deleteNode(root.left, key);
    }else {
      root.right = deleteNode(root.right, key);
    }
    return root;
  }
}
