package oracle._098_Validate_Binary_Search_Tree;

import definition.binaryTree.TreeNode;
import definition.binaryTree.TreeNodes;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * @author jacka
 * @version 1.0 on 11/29/2019
 */
class SolutionITest {

  @ParameterizedTest
  @MethodSource("solutionStream")
  public void test213(Solution solution) {
    TreeNode root = new TreeNode(2);
    root.left = new TreeNode(1);
    root.right = new TreeNode(3);
    assertTrue(solution.isValidBST(root));
  }

  @ParameterizedTest
  @MethodSource("solutionStream")
  public void test123(Solution solution) {
    TreeNode root = new TreeNode(1);
    root.left = new TreeNode(2);
    root.right = new TreeNode(3);
    assertFalse(solution.isValidBST(root));
  }

  @ParameterizedTest
  @MethodSource("solutionStream")
  public void testFailedCase1(Solution solution) {
    TreeNode root = new TreeNode(5);
    root.left = new TreeNode(14);
    root.left.left = new TreeNode(1);
    assertFalse(solution.isValidBST(root));
  }

  @ParameterizedTest
  @MethodSource("solutionStream")
  public void testFailedCase2(Solution solution) {
    TreeNode root = TreeNodes.getTreeLevelOrder(1, 1);
    assertFalse(solution.isValidBST(root));
  }

  static Stream<Solution> solutionStream() {
    return Stream.of(
        new SolutionI()
    );
  }
}