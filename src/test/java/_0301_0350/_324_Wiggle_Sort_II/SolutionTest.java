package _0301_0350._324_Wiggle_Sort_II;


import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.Assert.assertTrue;
import static utils._324_Wiggle_Sort_II.Validator.assertIsWiggle;

/**
 * @author jacka
 * @version 1.0 on 9/3/2017.
 */
class SolutionTest {

  @ParameterizedTest
  @MethodSource("solutionProvider")
  void testFailedCase(Solution solution) {
    final int[] input = {1, 2, 2, 1, 2, 1, 1, 1, 1, 2, 2, 2};
    solution.wiggleSort(input);
    assertTrue(assertIsWiggle(input));
  }

  @ParameterizedTest
  @MethodSource("solutionProvider")
  void testFailedCase2(Solution solution) {
    final int[] input = {1};
    solution.wiggleSort(input);
    assertTrue(assertIsWiggle(input));
  }

  @ParameterizedTest
  @MethodSource("solutionProvider")
  void testFailedCase3(Solution solution) {
    final int[] input = {4, 5, 5, 6};
    solution.wiggleSort(input);
    assertTrue(assertIsWiggle(input));
  }

  static Stream<Solution> solutionProvider() {
    return Stream.of(
        new Solution()
    );
  }
}
