package interviews.byteDance._071_Simplify_Path;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author zhixi
 * @version 1.0 on 5/6/2020
 */
class SolutionITest {

  @ParameterizedTest
  @MethodSource("solutionProvider")
  public void testWithRoot(Solution solution) {
    assertEquals("/", solution.simplifyPath("/"));
  }

  @ParameterizedTest
  @MethodSource("solutionProvider")
  public void testWithRootSimple(Solution solution) {
    assertEquals("/", solution.simplifyPath("/c/c/../../"));
  }

  @ParameterizedTest
  @MethodSource("solutionProvider")
  public void test1(Solution solution) {
    assertEquals("/c/e", solution.simplifyPath("/c/./c/../e"));
  }

  @ParameterizedTest
  @MethodSource("solutionProvider")
  public void testMissed1(Solution solution) {
    assertEquals("/", solution.simplifyPath("/.."));
  }

  static Stream<Solution> solutionProvider() {
    return Stream.of(
        new SolutionI()
    );
  }
}