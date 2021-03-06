package microsoft._173_Binary_Search_Tree_Iterator;

import definition.binaryTree.TreeNode;

import java.util.ArrayDeque;
import java.util.Deque;

public class BSTIterator {

  private final Deque<TreeNode> stack = new ArrayDeque<>();

  public BSTIterator(TreeNode root) {
    while (root != null) {
      stack.push(root);
      root = root.left;
    }
  }

  /**
   * @return whether we have a next smallest number
   */
  public boolean hasNext() {
    return !stack.isEmpty();
  }

  /**
   * @return the next smallest number
   */
  public int next() {
    TreeNode curNode = stack.pop();
    final int res = curNode.val;
    curNode = curNode.right;
    while (curNode != null) {
      stack.push(curNode);
      curNode = curNode.left;
    }
    return res;
  }
}
