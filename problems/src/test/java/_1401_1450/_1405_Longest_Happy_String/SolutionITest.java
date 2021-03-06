package _1401_1450._1405_Longest_Happy_String;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Set;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * @author jacka
 * @version 1.0 on 4/4/2020
 */
class SolutionITest {

  @ParameterizedTest
  @MethodSource("solutionStream")
  void testOnlineCase1(Solution solution) {
    final int a = 1, b = 1, c = 7;
    final Set<String> expected = Set.of("ccaccbcc", "ccbccacc");
    final String actual = solution.longestDiverseString(a, b, c);
    assertTrue(expected.contains(actual));
  }

  @ParameterizedTest
  @MethodSource("solutionStream")
  void testOnlineCase2(Solution solution) {
    final int a = 2, b = 2, c = 1;
    final Set<String> expected = Set.of("aabbc", "ababc");
    final String actual = solution.longestDiverseString(a, b, c);
    assertTrue(expected.contains(actual));
  }

  @ParameterizedTest
  @MethodSource("solutionStream")
  void testOnlineCase3(Solution solution) {
    final int a = 7, b = 1, c = 0;
    final Set<String> expected = Set.of("aabaa");
    final String actual = solution.longestDiverseString(a, b, c);
    assertTrue(expected.contains(actual));
  }

  @ParameterizedTest
  @MethodSource("solutionStream")
  void testOnlineCase5(Solution solution) {
    final int a = 4, b = 2, c = 0;
    final Set<String> expected = Set.of("aabbaa", "aabaab");
    final String actual = solution.longestDiverseString(a, b, c);
    assertTrue(expected.contains(actual));
  }

  @ParameterizedTest
  @MethodSource("solutionStream")
  void testOnlineCase4(Solution solution) {
    final int a = 0, b = 8, c = 11;
    //                                  "ccbbccbbccbbccbbcc"
    //                                  "ccbccbccbbccbbccbbc"
    final Set<String> expected = Set.of("ccbccbbccbbccbbccbc", "ccbccbccbbccbbccbbc");
    final String actual = solution.longestDiverseString(a, b, c);
    assertTrue(expected.contains(actual));
  }

  static Stream<Solution> solutionStream() {
    return Stream.of(
        new SolutionI()
    );
  }
}