package com.leetcode.binaryTree;

public class SerializeDeserializeBinaryTree {

  public String serialize(TreeNode root) {
    StringBuilder sb = new StringBuilder();
    serialize(root,sb);
    return sb.toString();
  }

  private void serialize(TreeNode root,StringBuilder sb) {
    if(root == null){
      sb.append("null,");
      return;
    }
    sb.append(root.val + ",");
    serialize(root.left, sb);
    serialize(root.right, sb);
  }

  static int idx = 0;
  public TreeNode deserialize(String data) {
    String arr[] = data.split(",");
    return deserialize(arr);
  }

  private TreeNode deserialize(String arr[]) {
    if(idx >= arr.length || arr[idx].equals("null")) {
      idx++;
      return null;
    }

    TreeNode node = new TreeNode(Integer.parseInt(arr[idx++]));
    node.left = deserialize(arr);
    node.right = deserialize(arr);
    return node;
  }

}

