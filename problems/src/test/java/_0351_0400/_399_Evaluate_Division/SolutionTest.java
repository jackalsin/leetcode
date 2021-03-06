package _0351_0400._399_Evaluate_Division;


import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;


/**
 * @author jacka
 * @version 1.0 on 11/11/2017.
 */
class SolutionTest {

  @ParameterizedTest
  @MethodSource("solutionStream")
  void testOnlineCase1(Solution solution) {
    final String[][] equations = {{"a", "b"}, {"b", "c"}};
    final double[] values = {2.0, 3.0};
    final String[][] queries = {{"a", "c"}, {"b", "c"}, {"a", "e"}, {"a", "a"}, {"x", "x"}};
    final double[] expected = {6.00000, 3.00000, -1.00000, 1.00000, -1.00000};
    final double[] actual = solution.calcEquation(equations, values, queries);
    assertArrayEquals(expected, actual, 1E-5);
  }

  static Stream<Solution> solutionStream() {
    return Stream.of(
        new Solution()
    );
  }
}
