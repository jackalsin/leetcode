package _0601_0650._645_Set_Mismatch;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

/**
 * @author jacka
 * @version 1.0 on 3/8/2020
 */
class SolutionITest {

  @ParameterizedTest
  @MethodSource("solutionStream")
  void testOnlineCase1(Solution solution) {
    final int[] nums = {1, 2, 2, 4};
    assertArrayEquals(new int[]{2, 3}, solution.findErrorNums(nums));
  }

  static Stream<Solution> solutionStream() {
    return Stream.of(
        new MapSolution(),
        new ArraySolution(),
        new O1SpaceSolution()
    );
  }
}