package _0201_0250._221_Maximal_Square;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import definition.TwoDimensionArray;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author Zhiwei.Xin
 * @version 1.0 on 8/15/2017.
 */
class SolutionTest {
  @ParameterizedTest
  @MethodSource("solutionStream")
  void testOnlineCase(Solution solution) throws Exception {
    final char[][] board = TwoDimensionArray.getCharBoard(new String[]{
        "10100", "10111", "11111", "10010"
    });

    assertEquals(4, solution.maximalSquare(board));
  }

  @ParameterizedTest
  @MethodSource("solutionStream")
  void testOnlineCaseOFailed(Solution solution) throws Exception {
    final char[][] board = TwoDimensionArray.getCharBoard(new String[]{
        "1010", "1011", "1011", "1111"
    });
    assertEquals(4, solution.maximalSquare(board));
  }

  @ParameterizedTest
  @MethodSource("solutionStream")
  void testFailed(Solution solution) throws Exception {
    final char[][] board = TwoDimensionArray.getCharBoard(new String[]{
        "10", "01", "01", "01", "11", "00", "01"
    });
    assertEquals(1, solution.maximalSquare(board));
  }

  static Stream<Solution> solutionStream() {
    return Stream.of(
        new Solution()
    );
  }
}
