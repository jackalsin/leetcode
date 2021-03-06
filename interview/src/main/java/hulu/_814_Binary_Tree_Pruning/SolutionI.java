package hulu._814_Binary_Tree_Pruning;

import definition.binaryTree.TreeNode;

/**
 * @author jacka
 * @version 1.0 on 12/14/2019
 */
public final class SolutionI implements Solution {
  @Override
  public TreeNode pruneTree(TreeNode root) {
    if (root == null) {
      return null;
    }
    root.left = pruneTree(root.left);
    root.right = pruneTree(root.right);
    if (root.left == null && root.right == null && root.val == 0) {
      return null;
    }
    return root;
  }
}
