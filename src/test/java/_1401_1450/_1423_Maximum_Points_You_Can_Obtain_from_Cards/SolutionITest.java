package _1401_1450._1423_Maximum_Points_You_Can_Obtain_from_Cards;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author jacka
 * @version 1.0 on 4/11/2020
 */
class SolutionITest {

  @ParameterizedTest
  @MethodSource("solutionProvider")
  void testOnlineCase1(Solution solution) {
    final int cardPoints[] = {1, 2, 3, 4, 5, 6, 1}, k = 3, expected = 12;
    assertEquals(expected, solution.maxScore(cardPoints, k));
  }

  @ParameterizedTest
  @MethodSource("solutionProvider")
  void testOnlineCase2(Solution solution) {
    final int cardPoints[] = {9, 7, 7, 9, 7, 7, 9}, k = 7, expected = 55;
    assertEquals(expected, solution.maxScore(cardPoints, k));
  }

  @ParameterizedTest
  @MethodSource("solutionProvider")
  void testOnlineCase5(Solution solution) {
    final int cardPoints[] = {2, 2, 2}, k = 2, expected = 4;
    assertEquals(expected, solution.maxScore(cardPoints, k));

  }

  static Stream<Solution> solutionProvider() {
    return Stream.of(
        new SolutionI()
    );
  }
}