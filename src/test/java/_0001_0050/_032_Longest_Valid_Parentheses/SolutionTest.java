package _0001_0050._032_Longest_Valid_Parentheses;


import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author jacka
 * @version 1.0 on 2017/2/8.
 */
class SolutionTest {

  @ParameterizedTest
  @MethodSource("solutionProvider")
  void testWithAllValid(Solution solution) {
    assertEquals(8, solution.longestValidParentheses("(()()())"));
  }

  @ParameterizedTest
  @MethodSource("solutionProvider")
  void testWithLeadingValid(Solution solution) {
    assertEquals(8, solution.longestValidParentheses("(()()()()"));
  }

  @ParameterizedTest
  @MethodSource("solutionProvider")
  void testWithTailingValid(Solution solution) {
    assertEquals(8, solution.longestValidParentheses("()()()())"));
  }

  @ParameterizedTest
  @MethodSource("solutionProvider")
  void testWithAllInvalid(Solution solution) {
    assertEquals(0, solution.longestValidParentheses(")("));
  }

  static Stream<Solution> solutionProvider() {
    return Stream.of(new Solution());
  }
}