package _1151_1200._1170_Compare_Strings_by_Frequency_of_the_Smallest_Character;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

/**
 * @author jacka
 * @version 1.0 on 10/20/2019
 */
class SolutionTest {

  @ParameterizedTest
  @MethodSource("solutionStream")
  void testOnlineCase1(Solution solution) {
    final String[] queries = {"cbd"}, words = {"zaaaz"};
    final int[] expected = {1},
        actual = solution.numSmallerByFrequency(queries, words);
    assertArrayEquals(expected, actual);
  }

  @ParameterizedTest
  @MethodSource("solutionStream")
  void testOnlineCase2(Solution solution) {
    final String[] queries = {"bbb", "cc"}, words = {"a", "aa", "aaa", "aaaa"};
    final int[] expected = {1, 2},
        actual = solution.numSmallerByFrequency(queries, words);
    assertArrayEquals(expected, actual);
  }

  @ParameterizedTest
  @MethodSource("solutionStream")
  void testOnlineCase3(Solution solution) {
    final String[] queries = {"bba", "abaaaaaa", "aaaaaa", "bbabbabaab", "aba", "aa", "baab", "bbbbbb", "aab",
        "bbabbaabb"}, words = {"aaabbb", "aab", "babbab", "babbbb", "b", "bbbbbbbbab", "a", "bbbbbbbbbb", "baaabbaab"
        , "aa"};
    final int[] expected = {6, 1, 1, 2, 3, 3, 3, 1, 3, 2},
        actual = solution.numSmallerByFrequency(queries, words);
    assertArrayEquals(expected, actual);
  }

  @ParameterizedTest
  @MethodSource("solutionStream")
  void testOnlineCase4(Solution solution) {
    final String[] queries = {"aabbabbb", "abbbabaa", "aabbbabaa", "aabba", "abb", "a", "ba", "aa", "ba", "baabbbaaaa"
        , "babaa", "bbbbabaa"}, words = {"b", "aaaba", "aaaabba", "aa", "aabaabab", "aabbaaabbb", "ababb", "bbb",
        "aabbbabb", "aab", "bbaaababba", "baaaaa"};
    final int[] expected = {6, 5, 0, 6, 11, 11, 11, 8, 11, 0, 6, 6},
        actual = solution.numSmallerByFrequency(queries, words);
    assertArrayEquals(expected, actual);
  }

  static Stream<Solution> solutionStream() {
    return Stream.of(
        new SolutionI(),
        new SolutionII()
    );
  }
}