package linkedin._079_Word_Search;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class SolutionTest {
  private static final char[][] BOARD = new char[][]{
      {'A', 'B', 'C', 'E'},
      {'S', 'F', 'C', 'S'},
      {'A', 'D', 'E', 'E'}
  };

  @ParameterizedTest
  @MethodSource("solutionStream")
  void testWithOnlineCase(Solution solution) {
    assertTrue(solution.exist(BOARD, "ASA"));
  }

  @ParameterizedTest
  @MethodSource("solutionStream")
  void testWithOnlineCase2(Solution solution) {
    assertTrue(solution.exist(BOARD, "ABC"));
  }

  @ParameterizedTest
  @MethodSource("solutionStream")
  void testWithDupVisited(Solution solution) {
    assertFalse(solution.exist(BOARD, "BFB"));
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