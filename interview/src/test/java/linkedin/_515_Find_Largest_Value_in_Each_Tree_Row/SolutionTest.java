package linkedin._515_Find_Largest_Value_in_Each_Tree_Row;

import definition.binaryTree.TreeNode;
import definition.binaryTree.TreeNodes;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author jacka
 * @version 1.0 on 8/15/2019
 */
class SolutionTest {

  @ParameterizedTest
  @MethodSource("solutionStream")
  void testOnlineCase1(Solution solution) {
    final TreeNode root = TreeNodes.getTreeLevelOrder(
        1,
        3, 2,
        5, 3, null, 9
    );
    final List<Integer> expected = List.of(
        1, 3, 9
    ), actual = solution.largestValues(root);
    assertEquals(expected, actual);
  }

  static Stream<Solution> solutionStream() {
    return Stream.of(
        new SolutionI(),
        new SolutionII(),
        new BfsSolution(),
        new DfsSolution()
    );
  }
}