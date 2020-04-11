package _0851_0900._876_Middle_of_the_Linked_List;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import utils.ListNode;
import utils.ListNodes;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author jacka
 * @version 1.0 on 4/8/2020
 */
class SolutionITest {

  @ParameterizedTest
  @MethodSource("solutionProvider")
  void testOnlineCase1(Solution solution) {
    final ListNode input = ListNodes.getListOfNodes(1, 2, 3, 4, 5),
        expected = ListNodes.getListOfNodes(3, 4, 5),
        actual = solution.middleNode(input);
    assertEquals(expected, actual);
  }

  @ParameterizedTest
  @MethodSource("solutionProvider")
  void testOnlineCase2(Solution solution) {
    final ListNode input = ListNodes.getListOfNodes(1, 2, 3, 4, 5, 6),
        expected = ListNodes.getListOfNodes(4, 5, 6),
        actual = solution.middleNode(input);
    assertEquals(expected, actual);
  }

  static Stream<Solution> solutionProvider() {
    return Stream.of(
        new SolutionI()
    );
  }
}