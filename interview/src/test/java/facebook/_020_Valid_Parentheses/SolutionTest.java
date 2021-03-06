package facebook._020_Valid_Parentheses;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class SolutionTest {

  @ParameterizedTest
  @MethodSource("solutionProvider")
  void testEmptyString(Solution solution) {
    assertTrue(solution.isValid(""));
  }

  @ParameterizedTest
  @MethodSource("solutionProvider")
  void testIsValid1(Solution solution) {
    assertTrue(solution.isValid("()"));
  }

  @ParameterizedTest
  @MethodSource("solutionProvider")
  void testIsValid2(Solution solution) {
    assertTrue(solution.isValid("()[]"));
  }

  @ParameterizedTest
  @MethodSource("solutionProvider")
  void testIsValid3(Solution solution) {
    assertTrue(solution.isValid("()[]{}"));
  }

  @ParameterizedTest
  @MethodSource("solutionProvider")
  void testIsValid4(Solution solution) {
    assertTrue(solution.isValid("([]{})"));
  }

  @ParameterizedTest
  @MethodSource("solutionProvider")
  void testIsValid5(Solution solution) {
    assertFalse(solution.isValid("([)]"));
  }

  @ParameterizedTest
  @MethodSource("solutionProvider")
  void testIsValid6(Solution solution) {
    assertFalse(solution.isValid("{(})"));
  }

  @ParameterizedTest
  @MethodSource("solutionProvider")
  void testIsValid7(Solution solution) {
    assertFalse(solution.isValid("["));
  }

  static Stream<Solution> solutionProvider() {
    return Stream.of(
        new Solution()
    );
  }
}