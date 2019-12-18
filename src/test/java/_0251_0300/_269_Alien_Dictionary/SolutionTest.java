package _0251_0300._269_Alien_Dictionary;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author Zhiwei.Xin
 * @version 1.0 on 8/29/2017.
 */
class SolutionTest {

  @ParameterizedTest
  @MethodSource("solutionProvider")
  void testExample1(Solution solution) {
    assertEquals("wertf", solution.alienOrder(new String[]{"wrt", "wrf", "er", "ett", "rftt"}));
  }

  @ParameterizedTest
  @MethodSource("solutionProvider")
  void testExample2(Solution solution) {
    assertEquals("zx", solution.alienOrder(new String[]{"z", "x"}));
  }

  @ParameterizedTest
  @MethodSource("solutionProvider")
  void testExample3(Solution solution) {
    assertEquals("", solution.alienOrder(new String[]{"z", "x", "z"}));
  }

  @ParameterizedTest
  @MethodSource("solutionProvider")
  void testFailed(Solution solution) {
    assertEquals("acb", solution.alienOrder(new String[]{"ac", "ab", "b"}));
  }

  @ParameterizedTest
  @MethodSource("solutionProvider")
  void testFailed2(Solution solution) {
    assertEquals("acb", solution.alienOrder(new String[]{"ac", "ab", "b"}));
  }

  @ParameterizedTest
  @MethodSource("solutionProvider")
  void testFailed3(Solution solution) {
    assertEquals("z", solution.alienOrder(new String[]{"z", "z"}));
  }

  @ParameterizedTest
  @MethodSource("solutionProvider")
  void testFailed4(Solution solution) {
    assertEquals("z", solution.alienOrder(new String[]{"z", "z", "z"}));
  }

  @ParameterizedTest
  @MethodSource("solutionProvider")
  void testFailed5(Solution solution) {
    assertEquals("zf", solution.alienOrder(new String[]{"z", "z", "f"}));
  }

  static Stream<Solution> solutionProvider() {
    return Stream.of(
        new Solution()
    );
  }
}
