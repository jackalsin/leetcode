package _0201_0250._202_Happy_Number;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * @author jacka
 * @version 1.0 on 8/5/2017.
 */
class SolutionTest {
  static Stream<Solution> solutionProvider() {
    return Stream.of(new SolutionI(), new SolutionII());
  }

  @ParameterizedTest
  @MethodSource("solutionProvider")
  void testIsHappy(Solution solution) {
    assertTrue(solution.isHappy(19));
  }

  @ParameterizedTest
  @MethodSource("solutionProvider")
  void test887(Solution solution) {
    assertFalse(solution.isHappy(887));
  }

}
