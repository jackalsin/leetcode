package oracle._056_Merge_Intervals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

/**
 * @author jacka
 * @version 1.0 on 10/21/2019
 */
class SolutionTest {

  @ParameterizedTest
  @MethodSource("solutionStream")
  void testOnlineCaseNull(Solution solution) {
    final int[][] input = null, expected = new int[][]{},
        actual = solution.merge(input);
    assertArrayEquals(expected, actual);
  }

  @ParameterizedTest
  @MethodSource("solutionStream")
  void testOnlineCaseEmpty(Solution solution) {
    final int[][] input = new int[][]{}, expected = new int[][]{},
        actual = solution.merge(input);
    assertArrayEquals(expected, actual);
  }

  @ParameterizedTest
  @MethodSource("solutionStream")
  void testSingleElement(Solution solution) {
    final int[][] input = {{1, 3}}, expected = {{1, 3}},
        actual = solution.merge(input);
    assertArrayEquals(expected, actual);
  }

  @ParameterizedTest
  @MethodSource("solutionStream")
  void testMergeElement(Solution solution) {
    final int[][] input = {{1, 3}, {3, 5}}, expected = {{1, 5}},
        actual = solution.merge(input);
    assertArrayEquals(expected, actual);
  }

  @ParameterizedTest
  @MethodSource("solutionStream")
  void testNotMergeElement(Solution solution) {
    final int[][] input = {{1, 3}, {4, 5}}, expected = {{1, 3}, {4, 5}},
        actual = solution.merge(input);
    assertArrayEquals(expected, actual);
  }

  static Stream<Solution> solutionStream() {
    return Stream.of(
        new SolutionI()
    );
  }
}