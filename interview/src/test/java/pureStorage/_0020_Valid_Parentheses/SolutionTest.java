package pureStorage._0020_Valid_Parentheses;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class SolutionTest {

  @ParameterizedTest
  @MethodSource("solutionStream")
  void testOnlineCase1(Solution solution) {
    final String input = "";
    assertTrue(solution.isValid(input));
  }


  @ParameterizedTest
  @MethodSource("solutionStream")
  void testOnlineCase2(Solution solution) {
    final String input = "()";
    assertTrue(solution.isValid(input));
  }

  @ParameterizedTest
  @MethodSource("solutionStream")
  void testOnlineCase3(Solution solution) {
    final String input = "{}";
    assertTrue(solution.isValid(input));
  }

  @ParameterizedTest
  @MethodSource("solutionStream")
  void testOnlineCase4(Solution solution) {
    final String input = "[]";
    assertTrue(solution.isValid(input));
  }

  @ParameterizedTest
  @MethodSource("solutionStream")
  void testOnlineCaseLeftOpen(Solution solution) {
    final String input = "[()";
    assertFalse(solution.isValid(input));
  }

  static Stream<Solution> solutionStream() {
    return Stream.of(
        new SolutionI()
    );
  }
}