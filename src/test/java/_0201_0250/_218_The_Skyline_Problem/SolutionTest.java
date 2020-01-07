package _0201_0250._218_The_Skyline_Problem;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * @author jacka
 * @version 1.0 on 8/15/2017.
 */
public class SolutionTest {

  @ParameterizedTest
  @MethodSource("solutionProvider")
  public void testFailedCase(Solution solution) {
    final int[][] input = new int[][]{{2, 9, 10}, {3, 7, 15}, {5, 12, 12}, {15, 20, 10}, {19, 24, 8}};
    final List<int[]> expected = Arrays.asList(new int[]{2, 10}, new int[]{3, 15}, new int[]{7, 12},
        new int[]{12, 0}, new int[]{15, 10}, new int[]{20, 8}, new int[]{24, 0});
    solution.getSkyline(input);
  }

  @ParameterizedTest
  @MethodSource("solutionProvider")
  public void testFailedTestCase(Solution solution) {
    final int[][] input = new int[][]{{0, 3, 3}, {1, 5, 3}, {2, 4, 3}, {3, 7, 3}};
    final List<int[]> expected = Arrays.asList(
        new int[]{0, 3}, new int[]{7, 0});
    final List<int[]> actual = solution.getSkyline(input);
    for (int[] child : actual) {
      System.out.println(Arrays.toString(child));
    }
  }

  static Stream<Solution> solutionProvider() {
    return Stream.of(
        new Solution()
    );
  }
}
