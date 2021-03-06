package linkedin._339_Nested_List_Weight_Sum;

import definition.nestedInteger.NestedInteger;
import definition.nestedInteger.NestedIntegerImpl;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author jacka
 * @version 1.0 on 7/20/2019
 */
final class SolutionTest {
  @ParameterizedTest
  @MethodSource("solutionStream")
  void testOnlineCase(Solution solution) {
    final List<NestedInteger> list = List.of(
        new NestedIntegerImpl(new NestedIntegerImpl(1), new NestedIntegerImpl(1)),
        new NestedIntegerImpl(2),
        new NestedIntegerImpl(new NestedIntegerImpl(1), new NestedIntegerImpl(1))
    );
    assertEquals(10, solution.depthSum(list));
  }

  static Stream<Solution> solutionStream() {
    return Stream.of(
        new SolutionI(),
        new SolutionII(),
        new SolutionIII(),
        new SolutionIV(),
        new SolutionV()
    );
  }

}
