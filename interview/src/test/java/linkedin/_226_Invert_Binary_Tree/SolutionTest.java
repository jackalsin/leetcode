package linkedin._226_Invert_Binary_Tree;

import definition.binaryTree.TreeNode;
import definition.binaryTree.TreeNodes;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {

  @ParameterizedTest
  @MethodSource("solutionStream")
  void testOneNode(Solution solution) {
    TreeNode expected = new TreeNode(1);
    TreeNode actual = solution.invertTree(expected);
    assertEquals(expected, actual);
  }

  @ParameterizedTest
  @MethodSource("solutionStream")
  void test3LevelNodes(Solution solution) {
    TreeNode input = TreeNodes.getTreeLevelOrder(4, 2, 7, 1, 3, 6, 9);
    TreeNode actual = solution.invertTree(input);
    TreeNode expected = TreeNodes.getTreeLevelOrder(4, 7, 2, 9, 6, 3, 1);
    assertEquals(expected, actual);
  }

  static Stream<Solution> solutionStream() {
    return Stream.of(
        new SolutionI(),
        new SolutionII()
    );
  }
}