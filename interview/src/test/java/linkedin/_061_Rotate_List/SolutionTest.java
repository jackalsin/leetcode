package linkedin._061_Rotate_List;

import definition.ListNode;
import definition.ListNodes;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {
  @ParameterizedTest
  @MethodSource("solutionStream")
  void testWith5And2(Solution solution) {
    ListNode head = ListNodes.getListOfNodes(new int[]{1, 2, 3, 4, 5});
    ListNode expected = ListNodes.getListOfNodes(new int[]{4, 5, 1, 2, 3});
    assertEquals(expected, solution.rotateRight(head, 2));
  }

  @ParameterizedTest
  @MethodSource("solutionStream")
  void testWith5And7(Solution solution) {
    ListNode head = ListNodes.getListOfNodes(new int[]{1, 2, 3, 4, 5});
    ListNode expected = ListNodes.getListOfNodes(new int[]{4, 5, 1, 2, 3});
    assertEquals(expected, solution.rotateRight(head, 7));
  }

  @ParameterizedTest
  @MethodSource("solutionStream")
  void testWith0And0(Solution solution) {
    ListNode head = null;
    ListNode expected = null;
    assertEquals(expected, solution.rotateRight(head, 0));
  }

  @ParameterizedTest
  @MethodSource("solutionStream")
  void testWith1And1(Solution solution) {
    ListNode head = ListNodes.getListOfNodes(new int[]{1});
    ListNode expected = ListNodes.getListOfNodes(new int[]{1});
    assertEquals(expected, solution.rotateRight(head, 1));
  }

  @ParameterizedTest
  @MethodSource("solutionStream")
  void testWith1And0(Solution solution) {
    ListNode head = ListNodes.getListOfNodes(new int[]{1});
    ListNode expected = ListNodes.getListOfNodes(new int[]{1});
    assertEquals(expected, solution.rotateRight(head, 0));
  }

  @ParameterizedTest
  @MethodSource("solutionStream")
  void testWith2And0(Solution solution) {
    ListNode head = ListNodes.getListOfNodes(new int[]{1, 2});
    ListNode expected = ListNodes.getListOfNodes(new int[]{1, 2});
    assertEquals(expected, solution.rotateRight(head, 0));
  }

  @ParameterizedTest
  @MethodSource("solutionStream")
  void testWith2And2(Solution solution) {
    ListNode head = ListNodes.getListOfNodes(new int[]{1, 2});
    ListNode expected = ListNodes.getListOfNodes(new int[]{1, 2});
    assertEquals(expected, solution.rotateRight(head, 2));
  }

  static Stream<Solution> solutionStream() {
    return Stream.of(
        new SolutionI(),
        new SolutionII(),
        new SolutionIII(),
        new SolutionIV()
    );
  }
}