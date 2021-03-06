package _0201_0250._238_Product_of_Array_Except_Self;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;


/**
 * @author jacka
 * @version 1.0 on 8/19/2017.
 */
public class SolutionTest {
  @ParameterizedTest
  @MethodSource("solutionStream")
  public void testOnlineCase(Solution solution) throws Exception {
    final int[] input = new int[]{1, 2, 3, 4};
    final int[] expected = new int[]{24, 12, 8, 6};
    assertArrayEquals(expected, solution.productExceptSelf(input));
  }

  static Stream<Solution> solutionStream() {
    return Stream.of(new Solution());
  }
}
