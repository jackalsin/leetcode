package _0401_0450._443_String_Compression;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

/**
 * @author jacka
 * @version 1.0 on 10/29/2017.
 */
public class SolutionTest {

  @ParameterizedTest
  @MethodSource("solutionStream")
  public void testOnlineCase1(Solution solution) {
    final char[] input = {'a', 'a', 'b', 'b', 'c', 'c', 'c'};
    final char[] expected = {'a', '2', 'b', '2', 'c', '3'};
    final int range = solution.compress(input);
    assertArrayEquals(expected, input, range);
  }

  @ParameterizedTest
  @MethodSource("solutionStream")
  public void testOnlineCase2(Solution solution) {
    final char[] input = {'a'};
    final char[] expected = {'a'};
    final int range = solution.compress(input);
    assertArrayEquals(expected, input, range);
  }

  @ParameterizedTest
  @MethodSource("solutionStream")
  public void testOnlineCase3(Solution solution) {
    final char[] input = {'a', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b'};
    final char[] expected = {'a', 'b', '1', '2'};
    final int range = solution.compress(input);
    assertArrayEquals(expected, input, range);
  }

  /**
   * This one fails when we didn't update the target character.
   */
  @ParameterizedTest
  @MethodSource("solutionStream")
  public void testFailedOnNotUpdateChar(Solution solution) {
    final char[] input = {'a', 'a', 'a', 'b', 'b', 'a', 'a'};
    final char[] expected = {'a', '3', 'b', '2', 'a', '2'};
    final int range = solution.compress(input);
    assertArrayEquals(expected, input, range);
  }

  private static void assertArrayEquals(final char[] expected, final char[] actual, final int
      range) {
    assert expected.length == range;
    for (int i = 0; i < range; i++) {
      assert expected[i] == actual[i];
    }
  }

  static Stream<Solution> solutionStream() {
    return Stream.of(
        new Solution()
    );
  }
}
