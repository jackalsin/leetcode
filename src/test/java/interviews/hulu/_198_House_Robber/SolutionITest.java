package interviews.hulu._198_House_Robber;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.Assert.assertEquals;

/**
 * @author jacka
 * @version 1.0 on 2/24/2020
 */
class SolutionITest {

  @ParameterizedTest
  @MethodSource("solutionProvider")
  void testEmpty(Solution solution) {
    final int[] input = new int[]{};
    assertEquals(0, solution.rob(input));
  }

  @ParameterizedTest
  @MethodSource("solutionProvider")
  void testOne(Solution solution) {
    final int[] input = new int[]{1};
    assertEquals(1, solution.rob(input));
  }

  @ParameterizedTest
  @MethodSource("solutionProvider")
  void testTwo(Solution solution) {
    final int[] input = new int[]{1, 2};
    assertEquals(2, solution.rob(input));
  }


  @ParameterizedTest
  @MethodSource("solutionProvider")
  void testThree(Solution solution) {
    final int[] input = new int[]{1, 2, 3};
    assertEquals(4, solution.rob(input));
  }

  @ParameterizedTest
  @MethodSource("solutionProvider")
  void test131(Solution solution) {
    final int[] input = new int[]{1, 3, 1};
    assertEquals(3, solution.rob(input));
  }

  static Stream<Solution> solutionProvider() {
    return Stream.of(
        new SolutionI()
    );
  }
}