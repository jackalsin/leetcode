package _0051_0100._059_Spiral_Matrix_II;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import utils.TwoDimensionArray;

import java.util.stream.Stream;

import static org.junit.Assert.assertTrue;

/**
 * @author jacka
 * @version 1.0 on 4/22/2017.
 */
public class SolutionTest {

  static Stream<Solution> solutionProvider() {
    return Stream.of(
        new Solution()
    );
  }

  @ParameterizedTest
  @MethodSource("solutionProvider")
  public void testWith1(Solution solution) {
    int[][] expected = {{1}};
    assertTrue(TwoDimensionArray.TwoDimensionArrayEquals(expected, solution.generateMatrix(1)));
  }

  @ParameterizedTest
  @MethodSource("solutionProvider")
  public void testWith2(Solution solution) {
    int[][] expected = {{1, 2}, {4, 3}};
    assertTrue(TwoDimensionArray.TwoDimensionArrayEquals(expected, solution.generateMatrix(2)));
  }

  @ParameterizedTest
  @MethodSource("solutionProvider")
  public void testWith3(Solution solution) {
    int[][] expected = {{1, 2, 3}, {8, 9, 4}, {7, 6, 5}};
    assertTrue(TwoDimensionArray.TwoDimensionArrayEquals(expected, solution.generateMatrix(3)));
  }
}