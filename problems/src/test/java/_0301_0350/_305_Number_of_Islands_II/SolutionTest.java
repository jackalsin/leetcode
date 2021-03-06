package _0301_0350._305_Number_of_Islands_II;


import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;


/**
 * @author jacka
 * @version 1.0 on 9/13/2017.
 */
class SolutionTest {
  static Stream<Solution> solutionStream() {
    return Stream.of(
        new Solution()
    );
  }

  @ParameterizedTest
  @MethodSource("solutionStream")
  void testOnlineCase(Solution solution) {
    final int[][] input = {{0, 0}, {0, 1}, {1, 2}, {2, 1}};
    final List<Integer> actual = solution.numIslands2(3, 3, input),
        expected = List.of(1, 1, 2, 3);
    assertEquals(expected, actual);
  }

  @ParameterizedTest
  @MethodSource("solutionStream")
  void testFailedCase(Solution solution) {
    final int[][] input = {{0, 1}, {1, 2}, {2, 1}, {1, 0}, {0, 2},
        {0, 0}, {1, 1}};
    final List<Integer> actual = solution.numIslands2(3, 3, input),
        expected = List.of(1, 2, 3, 4, 3, 2, 1);
    assertEquals(expected, actual);
  }
}
