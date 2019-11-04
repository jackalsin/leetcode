package _0101_0150._125_Valid_Palindrome;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * @author Zhiwei.Xin
 * @version 1.0 on 6/26/2017.
 */
class SolutionTest {

  @ParameterizedTest
  @MethodSource("solutionProvider")
  void testEmpty(Solution solution) {
    assertTrue(solution.isPalindrome(""));
  }

  @ParameterizedTest
  @MethodSource("solutionProvider")
  void test1(Solution solution) {
    assertTrue(solution.isPalindrome("1"));
  }

  @ParameterizedTest
  @MethodSource("solutionProvider")
  void test2True(Solution solution) {
    assertTrue(solution.isPalindrome("11"));
  }

  @ParameterizedTest
  @MethodSource("solutionProvider")
  void test2False(Solution solution) {
    assertFalse(solution.isPalindrome("12"));
  }

  @ParameterizedTest
  @MethodSource("solutionProvider")
  void test3True(Solution solution) {
    assertTrue(solution.isPalindrome("121"));
  }

  @ParameterizedTest
  @MethodSource("solutionProvider")
  void test3False(Solution solution) {
    assertFalse(solution.isPalindrome("122"));
  }

  @ParameterizedTest
  @MethodSource("solutionProvider")
  void testADot(Solution solution) {
    assertTrue(solution.isPalindrome("a."));
  }

  static Stream<Solution> solutionProvider() {
    return Stream.of(
        new Solution()
    );
  }
}
