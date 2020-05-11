package interviews.tableau._043_Multiply_Strings;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.Assert.assertEquals;

/**
 * @author jacka
 * @version 1.0 on 2/18/2020
 */
class SolutionITest {

  @ParameterizedTest
  @MethodSource("solutionStream")
  void testWith11And11(Solution solution) {
    // no carry
    assertEquals("121", solution.multiply("11", "11"));

  }

  @ParameterizedTest
  @MethodSource("solutionStream")
  void testWith233And233(Solution solution) {
    // no carry
    assertEquals("54289", solution.multiply("233", "233"));
  }

  @ParameterizedTest
  @MethodSource("solutionStream")
  void testWithLeadingZero(Solution solution) {
    assertEquals(String.valueOf(43 * 27), solution.multiply("43", "27"));
  }

  @ParameterizedTest
  @MethodSource("solutionStream")
  void test999And999(Solution solution) {
    assertEquals(String.valueOf(999 * 999), solution.multiply("999", "999"));
  }

  static Stream<Solution> solutionStream() {
    return Stream.of(
        new SolutionI()
    );
  }
}